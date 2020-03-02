package com.java.thread_ticket_reservation_system;

class Ticket {

	public Ticket(Ticket ticket, String name, int noOfSeats) {
		
	}
	
	public boolean isAvailable() {
		return false;
	}

	public void bookticket(String name, int noOfSeats) {

	}

}

public class ThreadTicketReservationSystem {

	public static void main(String[] args) {
		
		//Ticket ticket=new Ticket(ticket, null, 0);

		new Thread(() -> {
			
		});

	}

}
