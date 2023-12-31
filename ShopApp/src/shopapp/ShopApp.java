/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopapp;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Omar
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Evelyn's Beauty Shop!");

        Customer c1 = new Customer("Pinky", 14);

        //c1.setName("Pinky");
        //c1.setSize("S");

        System.out.println("Min Price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1,item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};

        /* item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S"); */

        /* items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S"); */

        //System.out.println("Item 1" + "," + item1.description + "," + item1.price + "," + item1.size);
        //System.out.println("Item 2" + "," + item2.description + "," + item2.price + "," + item2.size);

        //total = (item1.price + item2.price *2) * (1 + tax);

        //int measurement = 8;

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
            .bindAddress(InetAddress.getLocalHost())
            .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }

        c1.addItems(items);
        //c1.setSize(measurement);

        System.out.println("Customer is " + c1.getName() + "," + c1.getSize() + "," + c1.getTotalClothingCost());

        for (Clothing item : c1.getItems()) {
                //System.out.println("Item " + item.getDescription() + "," + item.getSize() + "," + item.getPrice());
                System.out.println("Item output: " + item);
            }

            int average = 0;
            int count = 0;

            for (Clothing item : c1.getItems()) {
                if (item.getSize().equals("L")){
                count++;
                average += item.getPrice();
                }
            }
            try {
            average = (count == 0) ? 0 : average/count;
            average = average / count;
            System.out.println("Average price " + average + ", Count " + count);
            } catch (ArithmeticException e) {
                System.out.println("Don't divide by Zero");
            }

            Arrays.sort(c1.getItems());
            for (Clothing item : c1.getItems()) {
                System.out.println("Item output: " + item);
            }
        }
    }
