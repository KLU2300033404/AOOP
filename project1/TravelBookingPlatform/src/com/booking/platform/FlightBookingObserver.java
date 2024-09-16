package com.booking.platform;

public class FlightBookingObserver implements Observer{
	
	    private double minPriceFilter;

	    public FlightBookingObserver(double minPriceFilter) {
	        this.minPriceFilter = minPriceFilter;
	    }

	    @Override
	    public void update(Event event) {
	        if (event.getEventType() == Event.EventType.FLIGHT && event.getPrice() >= minPriceFilter) {
	            System.out.println("FlightBookingObserver: Event received - " + event);
	        }
	    }
	}



