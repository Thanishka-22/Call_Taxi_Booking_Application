package com.taxi.service;

import com.taxi.entity.Booking;
import com.taxi.entity.Taxi;
import java.util.ArrayList;
public class TaxiService {
	ArrayList<Taxi> taxis = new ArrayList<>();
	int bookingId = 1;

	public TaxiService(int taxiCount) {
		for (int i = 1; i <= taxiCount; i++) {
			taxis.add(new Taxi(i));
		}
	}
	public void bookTaxi(int customerId, char pickup, char drop, int pickupTime) {
		Taxi taxiChosen = null;
		int minDistance = 999;
		for (Taxi taxi : taxis) {
			if (taxi.freeTime <= pickupTime) {
				int distance = Math.abs(taxi.currentPoint - pickup);
				if (distance < minDistance) {
					minDistance = distance;
					taxiChosen = taxi;
				} else if (distance == minDistance && taxiChosen != null
						&& taxi.totalEarnings < taxiChosen.totalEarnings) {
					taxiChosen = taxi;
				}
			}
		}

		if (taxiChosen == null) {
			System.out.println("Booking rejected");
			return;
		}
		int points = Math.abs(drop - pickup);
		int dropTime = pickupTime + points;
		int km = points * 15;
		int amount = 100;
		if (km > 5) {
			amount = amount + (km - 5) * 10;
		}
		Booking booking = new Booking(bookingId, customerId, pickup, drop, pickupTime, dropTime, amount);
		bookingId++;
		taxiChosen.bookings.add(booking);
		taxiChosen.totalEarnings += amount;
		taxiChosen.currentPoint = drop;
		taxiChosen.freeTime = dropTime;
		System.out.println("Taxi can be allotted. Taxi-" + taxiChosen.id + " is allotted.");
	}
	public void displayTaxiDetails() {
		for (Taxi taxi : taxis) {
			if (taxi.bookings.size() == 0)
				continue;
			System.out.println("\nTaxi-" + taxi.id + " Total Earnings: Rs. " + taxi.totalEarnings);
			System.out.println("BookingID CustomerID From To PickupTime DropTime Amount");
			for (Booking b : taxi.bookings) {
				System.out.println(b.bookingId + "        " + b.customerId + "          " + b.from + "    " + b.to
						+ "     " + b.pickupTime + "          " + b.dropTime + "        " + b.amount);
			}
		}
	}
}