/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package program1;
import org.junit.Test;
import static org.junit.Assert.*;
import program1.Product;
import program1.ConcreteProduct;
//import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;



/**
 *
 * @author shimaa
 */
public class OrderTest {
   


    
    private Order order;
    private Customer customer;
    
    
  
    
    @Test
    public void testCalcTotal_PizzaOrder() {
        Product pizza = new ConcreteProduct("Pizza", 120.0);
        order.addProduct(pizza);
        order.calcTotal();
        assertEquals(120.0, order.total, 0.001);
    }
    
    @Test
    public void testCalcTotal_BurgerFriesCombo() {
        Product burger = new ConcreteProduct("Burger", 80.0);
        Product fries = new ConcreteProduct("Fries", 25.0);
        order.addProduct(burger);
        order.addProduct(fries);
        order.calcTotal();
        assertEquals(105.0, order.total, 0.001);
    }
    
    @Test
    public void testCalcTotal_EmptyOrder() {
        order.calcTotal();
        assertEquals(0.0, order.total, 0.001);
    }
    
    @Test
    public void testNotifyObservers_NoError() {
        // نختبر فقط عدم وجود خطأ
        assertDoesNotThrow(() -> order.notifyObservers("Order ready"));
    }
    @Test
void testSetPaymentStrategy() {
    PaymentStrategy strategy = new CashPayment();
    order.setPaymentStrategy(strategy);
    assertNotNull(strategy);
}
@Test
void testShowOrderDetail_NoException() {
    assertDoesNotThrow(() -> order.showOrderDetail());
}
}
