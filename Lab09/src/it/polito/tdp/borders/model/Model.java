package it.polito.tdp.borders.model;

import java.util.*;

import org.jgrapht.*;
import org.jgrapht.alg.ConnectivityInspector;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.borders.db.BordersDAO;

public class Model {

	private BordersDAO dao;
	private Map<Integer,Country> mapCountries;
	private Graph<Country,DefaultEdge> graph;
	
	public Model() {
		dao = new BordersDAO();
		mapCountries = new TreeMap<>();
		graph = new SimpleGraph<>(DefaultEdge.class);
		this.initialize();
	}

	private void initialize() {
		for(Country c : dao.loadAllCountries()) {
			mapCountries.put(c.getCountryCode(), c);
		}
		Graphs.addAllVertices(this.graph, dao.loadAllCountries());
	}
	
	public List<String> bordersForYear(int anno) {
		for(Border b : dao.getCountryPairs(anno)) {
			Country first = this.mapCountries.get(b.getFirstCountryCode());
			Country second = this.mapCountries.get(b.getSecondCountryCode());
			this.graph.addEdge(first, second);
		}
		List<String> result = new ArrayList<>();
		for(Country c : graph.vertexSet()) {
			result.add(c + " " + this.graph.degreeOf(c));
		}
		return result;
	}

	public Collection<Country> getCountries() {
		return this.mapCountries.values();
	}
	
	public int numberOfConnectedSets() {
		ConnectivityInspector<Country,DefaultEdge> c = new ConnectivityInspector<>(this.graph);
		return c.connectedSets().size();
	}
	

}
