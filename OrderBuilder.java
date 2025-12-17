/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;
import java.util.ArrayList;
/**
 *
 * @author shimaa
 */
public class OrderBuilder {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> items = new ArrayList<>();

    public OrderBuilder setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public OrderBuilder addProduct(Product p) {
        this.items.add(p);
        return this;
    }

    public Order build() {
        Order order = new Order(orderId, customer);
        for (Product p : items) {
            order.addProduct(p);
        }
        return order;
    }

   

   
}
