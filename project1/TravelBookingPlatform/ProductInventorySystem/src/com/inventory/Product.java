package com.inventory;

public class Product implements Comparable<Product>, Cloneable {
	
	    private int id;
	    private String name;
	    private double price;
	    private int quantity;

	    public Product(int id, String name, double price, int quantity) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    // Comparable implementation (compare by price)
	    @Override
	    public int compareTo(Product other) {
	        return Double.compare(this.price, other.price);
	    }

	    // Cloneable implementation
	    @Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    @Override
	    public String toString() {
	        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	    }
	}



