/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " EGP in Cash.");
    }
}
