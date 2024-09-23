package com.inventory;
import java.util.Collections;
public class ProductInventorySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Product p1 = new Product(1, "Laptop", 999.99, 10);
		        Product p2 = new Product(2, "Smartphone", 599.99, 50);
		        Product p3 = new Product(3, "Tablet", 299.99, 30);

		        // Create inventory and add products
		        Inventory inventory = new Inventory();
		        inventory.addProduct(p1);
		        inventory.addProduct(p2);
		        inventory.addProduct(p3);

		        // Display unsorted products
		        System.out.println("Unsorted Products:");
		        for (Product product : inventory) {
		            System.out.println(product);
		        }

		        // Sort by natural order (price, based on Comparable)
		        Collections.sort(inventory.getProducts());
		        System.out.println("\nProducts sorted by price (Comparable):");
		        for (Product product : inventory) {
		            System.out.println(product);
		        }

		        // Sort by custom comparator (name)
		        Collections.sort(inventory.getProducts(), new ProductNameComparator());
		        System.out.println("\nProducts sorted by name (Comparator):");
		        for (Product product : inventory) {
		            System.out.println(product);
		        }

		        // Clone a product
		        try {
		            Product clonedProduct = (Product) p1.clone();
		            System.out.println("\nCloned Product: " + clonedProduct);
		        } catch (CloneNotSupportedException e) {
		            e.printStackTrace();
		        }
		    }
		


	}


