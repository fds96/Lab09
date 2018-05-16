package it.polito.tdp.borders.model;

import java.util.Collection;
import java.util.List;

public class TestModel {

	public static void main(String[] args) {

		Model model = new Model();

		System.out.println("TestModel -- TODO");
		
		System.out.println("Creo il grafo relativo al 2000");
		List<String> lista = model.bordersForYear(2000);
		
		Collection<Country> countries = model.getCountries();
		System.out.format("Trovate %d nazioni\n", countries.size());
		
		for(String s : lista)
			System.out.println(s);
		
		System.out.println("Il numero di componenti connesse è: " + model.numberOfConnectedSets());

//		System.out.format("Numero componenti connesse: %d\n", model.getNumberOfConnectedComponents());
		
//		Map<Country, Integer> stats = model.getCountryCounts();
//		for (Country country : stats.keySet())
//			System.out.format("%s %d\n", country, stats.get(country));		
		
	}

}
