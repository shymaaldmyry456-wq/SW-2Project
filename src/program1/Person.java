/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public abstract class Person {//single res 
    private String name;
    private String phone;
    
    public Person(String n,String ph){
        this.name=n;
        this.phone=ph;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return name;
    }
     public void setPhone(String ph){
        this.phone=ph;
    }
      public String getPhone(){
        return phone;
    }
      public abstract void showInfo();//OCP
          
      
    
}
