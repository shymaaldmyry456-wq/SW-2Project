/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class CreditCardPayment implements  PaymentStrategy{
     private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " EGP using Credit Card: " + cardNumber);
    }
}
