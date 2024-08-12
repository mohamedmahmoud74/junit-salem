import org.example.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {


     Product product;
    @BeforeEach
    void setUp(){
        product = new Product();
    }

    @Test
    @DisplayName("Increasing Mouse Device By 150")
    void testIncreasingProductPriceBy150() {

        // Arrange
        product.setName("Mouse Device");
        product.setId(342);
        product.setPrice(100);

        // Action
        product.increasePrice(150);


        // Assertions
        assertEquals(250, product.getPrice());
    }

    @Test
    @DisplayName("Decreasing Laptop Device By 2000")
    void testDecreasingProductPriceBy2000() {

        // Arrange
        product.setName("Laptop Device");
        product.setId(4556);
        product.setPrice(12000);

        // Action
        product.decreasePrice(2000);


        // Assertions
        assertEquals(10000, product.getPrice());
    }




}
