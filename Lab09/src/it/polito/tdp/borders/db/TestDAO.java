package it.polito.tdp.borders.db;

import java.util.List;

import it.polito.tdp.borders.model.Country;
import it.polito.tdp.borders.model.Border;

public class TestDAO {

	public static void main(String[] args) {

		BordersDAO dao = new BordersDAO();

		System.out.println("Lista di tutte i confini:");
		List<Border> borders = dao.getCountryPairs(1996);
		for(Border b : borders) {
			System.out.println(b);
		}
	}
}
