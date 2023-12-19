/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp;

/**
 *
 * @author Omar
 */
public class Clothing {

    String description;
    private double price;
    private String size="M";

    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * MIN_TAX);
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price: MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
