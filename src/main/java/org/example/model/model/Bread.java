package org.example.model.model;

public class Bread extends ProductForSale {
    private String flourType;

    public Bread(String type, double price, String description, String flourType) {
        super(type, price, description);
        this.flourType = flourType;
    }

    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.flourType = "Unknown";
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Flour Type: " + flourType);
    }
}
