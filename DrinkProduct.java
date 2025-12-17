/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class DrinkProduct extends Product {//OCP وراثه من غير تعديل الكلاس الاصلي
    private final boolean isCold;
    public DrinkProduct(String n,double p ,boolean isCold){
        super(n,p);
        this.isCold=isCold;
        
    }
    @Override
  public  void showProduct(){
      System.out.println("Drink: "+getName()+" - "+getPrice()+"EGP "+"- "+"Cold: "+isCold);
  }
}
