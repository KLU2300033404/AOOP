package com.booking.platform;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Subject bookingSystem = new Subject();

		        
		        FlightBookingObserver flightObserver = new FlightBookingObserver(200.0);
		        HotelBookingObserver hotelObserver = new HotelBookingObserver(100.0);
		        CarRentalBookingObserver carRentalObserver = new CarRentalBookingObserver(50.0);

		        
		        bookingSystem.addObserver(flightObserver);
		        bookingSystem.addObserver(hotelObserver);
		        bookingSystem.addObserver(carRentalObserver);

		       
		        bookingSystem.createEvent(Event.EventType.FLIGHT, 250.0, "Flight to New York");
		        bookingSystem.createEvent(Event.EventType.HOTEL, 120.0, "Hotel in Paris");
		        bookingSystem.createEvent(Event.EventType.CAR_RENTAL, 40.0, "Car rental in Rome");
		        bookingSystem.createEvent(Event.EventType.FLIGHT, 180.0, "Flight to Tokyo");
		        bookingSystem.createEvent(Event.EventType.CAR_RENTAL, 60.0, "Car rental in Berlin");
		    }
		


	}


