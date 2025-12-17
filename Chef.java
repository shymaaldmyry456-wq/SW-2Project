/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public class Chef implements Observer{
     private String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Chef " + name + ": " + message);
    }
}
