/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program1;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;
import static javax.management.Query.or;

/**
 *
 * @author shimaa
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
            Scanner input =new  Scanner(System.in);
            System.out.println("====Welcome to Online Restaurant====");
            System.out.println("Enter Customer Name: ");
            String name=input.nextLine();
             System.out.println("EnterPhone number: ");
            String phone=input.nextLine();
             System.out.println("Enter Address: ");
            String address=input.nextLine();
             System.out.println("Enter email: ");
            String email=input.nextLine();
            Observer chef1 = new Chef("Ahmed");
            Customer c1=CustomerFactory.createCustomer(name, phone, address, email);
            ArrayList<Product> menu = new ArrayList<>();
        menu.add(new FoodProduct("Pizza", 120,false));
       
        menu.add(new FoodProduct("Pasta", 90,false));
        menu.add(new FoodProduct("Burger", 100,false));
        menu.add(new DrinkProduct("Juice", 40,true));
        menu.add(new DrinkProduct("Ice Cream", 50,true));

               
             
        
         System.out.println("=====Menu=====");
         
         for(int i=0;i<menu.size();i++){
             System.out.println(i+1+"." +menu.get(i).getName() +"-"+ menu.get(i).getPrice()+ "EGP" );
         }
             //انشاء الطلب
             System.out.println("Enter Order ID: ");
             String orderId=input.nextLine();
             
             OrderBuilder ob = new OrderBuilder()
        .setOrderId(orderId)
        .setCustomer(c1);
             Order or = ob.build();
             System.out.println("Choose payment method:");
System.out.println("1- Cash");
System.out.println("2- Credit Card");

int pm = input.nextInt();
input.nextLine(); // clear buffer

if(pm == 1){
    or.setPaymentStrategy(new CashPayment());
} else if(pm == 2){
    System.out.println("Enter card number: ");
    String card = input.nextLine();
  or.setPaymentStrategy(new CreditCardPayment(card));
}
             System.out.println("How many items do you want to order?");
             int count=input.nextInt();
             
             for(int i=0;i<count;i++){
                 System.out.println("Enter product number(1-" +menu.size() +"):");
                 
                 int choice=input.nextInt();
                 if(choice>=1&& choice<=menu.size()){
                     Product selected = menu.get(choice -1);
                     System.out.println("Do you want to add Extra Cheese? (1-Yes / 0-No)");
        int ex1 = input.nextInt();
        if(ex1 == 1){
            selected = new ExtraCheeseDecorator(selected) {
                @Override
                public void showProduct() {
                    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                }
            };
        }
                     ob.addProduct(selected);
                     
          
                 }else{
                     System.out.println("Invalid choice! try again.");
                     i--;
                 }
                 
             }
         or.addObserver(chef1);
     //عرض الفاتوره
     //
    }
    
}
