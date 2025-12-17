/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class CustomerFactory {
     public static Customer createCustomer(String name, String phone, String address, String email) {
        return new Customer(name, phone);
    }
    
}
