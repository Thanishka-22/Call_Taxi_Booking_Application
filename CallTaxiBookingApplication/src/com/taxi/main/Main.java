package com.taxi.main;

import com.taxi.service.TaxiService;

public class Main {

	public static void main(String[] args) {
		TaxiService service = new TaxiService(4);
		service.bookTaxi(1, 'A', 'B', 9);
		service.bookTaxi(2, 'B', 'D', 9);
		service.bookTaxi(3, 'B', 'C', 12);
		service.displayTaxiDetails();
	}
}