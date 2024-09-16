package com.booking.platform;

public class HotelBookingObserver implements Observer{
	
	    private double minPriceFilter;

	    public HotelBookingObserver(double minPriceFilter) {
	        this.minPriceFilter = minPriceFilter;
	    }

	    @Override
	    public void update(Event event) {
	        if (event.getEventType() == Event.EventType.HOTEL && event.getPrice() >= minPriceFilter) {
	            System.out.println("HotelBookingObserver: Event received - " + event);
	        }
	    }
	}



