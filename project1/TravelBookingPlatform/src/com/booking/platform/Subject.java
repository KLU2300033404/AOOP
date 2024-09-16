package com.booking.platform;
import java.util.ArrayList;
import java.util.List;
public class Subject {
	
	    private List<Observer> observers = new ArrayList<>();

	    public void addObserver(Observer observer) {
	        observers.add(observer);
	    }

	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	    public void notifyObservers(Event event) {
	        for (Observer observer : observers) {
	            observer.update(event);
	        }
	    }

	    public void createEvent(Event.EventType eventType, double price, String details) {
	        Event event = new Event(eventType, price, details);
	        notifyObservers(event);
	    }
	}



