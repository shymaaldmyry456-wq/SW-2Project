/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;

/**
 *
 * @author shimaa
 */
public abstract class  ProductDecorator extends Product{
    protected Product product;

    public ProductDecorator(Product product) {
        super(product.getName(), product.getPrice());
        this.product = product;
    }
}
