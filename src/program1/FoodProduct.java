/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class FoodProduct extends Product {//OCP وراثه من غير تعديل الكلاس الاصلي
    
    private boolean  isVegetarian;
    
    public FoodProduct(String n,double p,boolean isVegetarian){
        super (n,p);
        this.isVegetarian=isVegetarian;
    }
     public void showProduct(){
         System.out.println("Food: "+getName()+" - "+getPrice()+"EGP "+"- "+"Vegetarian:"+isVegetarian);
       
     }
    
    
}
