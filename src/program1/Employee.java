/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class Employee extends Person {
    private String role;
    
    public  Employee(String n,String ph,String r){
        super(n,ph);
        this.role=r;
    }
     public String getRole(){
            return role;
        }
     public void showInfo(){
          System.out.println("employee Name :"+getName());
         System.out.println("employee Phone :"+getPhone());
          System.out.println("employee Role :"+role);
     }
     public void manageOrder(OrderService order){
          System.out.println(getName()+"is managing the order:");
          order.showOrderDetail();
     }
    }
   
