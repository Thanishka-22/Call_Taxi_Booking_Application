package com.taxi.entity;

import java.util.ArrayList;

public class Taxi {
	public int id;
	public char currentPoint;
	public int freeTime;
	public int totalEarnings;
	public ArrayList<Booking> bookings;

	public Taxi(int id) {
		this.id = id;
		this.currentPoint = 'A';
		this.freeTime = 0;
		this.totalEarnings = 0;
		bookings = new ArrayList<>();
	}
}