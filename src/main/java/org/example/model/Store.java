package org.example.model;

import org.example.model.model.ProductForSale;
import org.example.model.model.Chocolate;
import org.example.model.model.Coke;
import org.example.model.model.Bread;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Chocolate", 5.99, "Delicious dark chocolate", "70%");
        products[1] = new Coke("Coke", 2.50, "Refreshing cola", false);
        products[2] = new Bread("Bread", 3.00, "Fresh whole wheat bread", "Whole Wheat");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}