/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public abstract class ExtraCheeseDecorator extends ProductDecorator {
     public ExtraCheeseDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() {
        return product.getName() + " + Extra Cheese";
    }

    @Override
    public double getPrice() {
        return product.getPrice() + 15;
    }
}
