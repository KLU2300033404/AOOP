package com.booking.platform;

public class Event {
	
	    public enum EventType {
	        FLIGHT, HOTEL, CAR_RENTAL
	    }

	    private EventType eventType;
	    private double price;
	    private String details;

	    public Event(EventType eventType, double price, String details) {
	        this.eventType = eventType;
	        this.price = price;
	        this.details = details;
	    }

	    public EventType getEventType() {
	        return eventType;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getDetails() {
	        return details;
	    }

	    @Override
	    public String toString() {
	        return "Event{" +
	                "eventType=" + eventType +
	                ", price=" + price +
	                ", details='" + details + '\'' +
	                '}';
	    }
	}



