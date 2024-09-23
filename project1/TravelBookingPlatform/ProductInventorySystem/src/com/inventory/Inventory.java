package com.inventory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Inventory implements Iterable<Product> {
	
	    private List<Product> products = new ArrayList<>();

	    // Add a product to the inventory
	    public void addProduct(Product product) {
	        products.add(product);
	    }

	    // Remove a product from the inventory
	    public void removeProduct(Product product) {
	        products.remove(product);
	    }

	    // Get all products in the inventory
	    public List<Product> getProducts() {
	        return products;
	    }

	    // Iterator implementation
	    @Override
	    public Iterator<Product> iterator() {
	        return products.iterator();
	    }
	}

