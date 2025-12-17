/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program1;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
/**
 *
 * @author shimaa
 */
public class CustomerTest {
     Customer customer;
    Order order;

    @Test
void testGetAddress() {
    assertEquals("Cairo", customer.getAddress());
}
@Test
void testGetEmail() {
    assertEquals("shimaa@gmail.com", customer.getEmail());
}
@Test
void testPlaceOrder_NoException() {
    assertDoesNotThrow(() -> customer.placeOrder(order));
}
@Test
void testShowInfo_NoException() {
    assertDoesNotThrow(() -> customer.showInfo());
}
}