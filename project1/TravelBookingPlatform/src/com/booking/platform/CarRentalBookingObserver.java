package com.booking.platform;

public class CarRentalBookingObserver implements Observer{
	
	    private double minPriceFilter;

	    public CarRentalBookingObserver(double minPriceFilter) {
	        this.minPriceFilter = minPriceFilter;
	    }

	    @Override
	    public void update(Event event) {
	        if (event.getEventType() == Event.EventType.CAR_RENTAL && event.getPrice() >= minPriceFilter) {
	            System.out.println("CarRentalBookingObserver: Event received - " + event);
	        }
	    }
	}



