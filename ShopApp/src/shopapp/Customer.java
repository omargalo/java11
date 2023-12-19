/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopapp;

/**
 *
 * @author Omar
 */
public class Customer {

    private String name;
    private String size;

    private Clothing[] items;

    public void addItems(Clothing[] someItems){
        items = someItems;
    }

    public double getTotalClothingCost() {

        double total = 0.0;

        for (Clothing item : items) {
            total = total + item.getPrice();
        }
        return total;
    }

    public Clothing[] getItems(){
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement){

        switch (measurement) {
            case 1: case 2: case 3:
                setSize("S");
                break;
            case 4: case 5: case 6:
                setSize("M");
                break;
            case 7: case 8: case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }
}
