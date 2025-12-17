/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class Customer extends Person implements CustomerAction {
    private String address;
     private String email;
    
    
    public Customer(String n, String ph){
        super(n,ph);
        this.address=address;
        this.email=email;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public void PlaceOrder(OrderService order){
        System.out.println( getName()+"placed an order successfully");
        order.showOrderDetail();
    }
    @Override
    public void showInfo(){//liskov substitution
        System.out.println("Customer Name :"+getName());
         System.out.println("Customer Phone :"+getPhone());
          System.out.println("Customer Address:"+address);
          System.out.println("Customer email:"+email);
        
    }

    Object placeOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
    

