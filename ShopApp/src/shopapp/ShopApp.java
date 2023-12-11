/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shopapp;

/**
 *
 * @author Omar
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Evelyn's Beauty Shop!");
        
        Customer c1 = new Customer();
                
        c1.name = "Pinky";
        System.out.println("Customer is " + c1.name);
        
    }
    
}
