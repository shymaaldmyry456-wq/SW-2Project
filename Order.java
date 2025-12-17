/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author shimaa
 */
public class Order implements OrderService ,Subject {
    //SRP,DIP يعتمد علي interface order service مش علي كلاس مباشر
     private ArrayList<Observer> observers = new ArrayList<>();
    private String order_id;
    private Customer customer;
    private ArrayList<Product> items;
    public double total;
    
    public Order(String or_id,Customer cust){
        this.customer=cust;
        this.order_id=or_id;
        this.items=new ArrayList<>();
    }
    private PaymentStrategy paymentStrategy;
public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
}
     public void addProduct(Product p){
            items.add(p);
        }
     public void calcTotal(){
         total=0;
         for(Product p :items){
             total+=p.getPrice();
         }
     }
    @Override
   public void showOrderDetail(){
       System.out.println("=====Order Details=====");
       System.out.println("Order ID :" +order_id);
       System.out.println("Customer Name :" +customer.getName());
       System.out.println("Products:");
       for(Product p :items){
           System.out.println(p.getName() + " - " + p.getPrice());
       }
       calcTotal();
   System.out.println("Total Price :"+total+"EGP");
    notifyObservers("New order added with total: " + total + " EGP");
    if(paymentStrategy != null){
        paymentStrategy.pay(total);
    }
       System.out.println("===============");
   }
   //Getters
   public String getOrder_id(){
       return order_id;
   }
   public Customer getCustomer(){
       return customer;
   }
   public ArrayList<Product> getItems(){
       return items;
   }
    @Override
    public void addObserver(Observer obs) {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
         observers.add(obs);
    }
    @Override
    public void removeObserver(Observer obs) {
         observers.remove(obs);
    }
    @Override
    public void notifyObservers(String message) {
        for(Observer obs : observers){
            obs.update(message);
        }
    }
    
}
