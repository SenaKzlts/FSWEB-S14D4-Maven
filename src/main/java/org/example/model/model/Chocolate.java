package org.example.model.model;

public class Chocolate extends ProductForSale {
    private String cocoaPercentage;

    public Chocolate(String type, double price, String description, String cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaPercentage = "Unknown";
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage);
    }
}
