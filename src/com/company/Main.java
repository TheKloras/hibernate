package com.company;

public class Main {

    public static void main(String[] args) {
	Airport airport = new Airport("Vilniaus oro oustas","Naujininkai","Vilnius");
	AirportDAO.insert(airport);
    }
}
