/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public abstract class Product {//SRP,OCP
    private String name;
    private double price;
    
    public Product(String n,double p){
        this.name=n;
        this.price=p;
    }
    public double getPrice(){
        return price;
    }
     public String getName(){
        return name;
    }
     public abstract void showProduct();
      
    
}
