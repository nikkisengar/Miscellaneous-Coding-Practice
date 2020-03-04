package com.java.thread_ticket_reservation_system;

class Ticket {

	private int availableSeats = 3;

	/*
	 * public Ticket(Ticket ticket, String name, int noOfSeats) {
	 * 
	 * }
	 * 
	 * public boolean isAvailable() { return false; }
	 */

	public void bookTicket(String passengerName, int noOfSeats) {
		
		//Checking for the availability of the seats
		if ((availableSeats >= noOfSeats) && (noOfSeats > 0)) {
			System.out.println("Hi, " + passengerName + ": " + noOfSeats + " seats booked successfully.");
			
			//Remaining available seats 
			availableSeats = availableSeats - noOfSeats;
		} 
		//If seats are not available
		else {
			System.out.println("Hi, " + passengerName + " seats are not available.");
		}
	}

}

public class ThreadTicketReservationSystem {

	public static void main(String[] args) {

		// Ticket ticket=new Ticket(ticket, null, 0);

		new Thread(() -> {

		});

	}

}
