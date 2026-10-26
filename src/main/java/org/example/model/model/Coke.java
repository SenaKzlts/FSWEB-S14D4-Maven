package org.example.model.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(String type, double price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.isDiet = false;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Is Diet: " + isDiet);
    }
}
