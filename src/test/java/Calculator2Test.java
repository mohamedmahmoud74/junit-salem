import org.example.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
@Execution(ExecutionMode.CONCURRENT)
public class Calculator2Test {

    static Calculator calculator;

    /*@BeforeEach                     // befor each test case
    void  BeforeEachTEstCase(){
        Calculator calculator =new Calculator();
        System.out.println("befor each test case ");
    }*/
    @BeforeAll // run before all methodes one time
    static void BeforeAll() {
        calculator = new Calculator();
        System.out.println(" run before all methodes one time");
    }
    @Tag("salem")
    @Test
    @DisplayName("test Add method")
    void testAdd() {
        assertEquals(calculator.add(10, 20), 30);
    }





    @Tag("salem")
    @Test
    @DisplayName("test sub method")
    void testsub() {
        assertEquals(calculator.sub(10, 20), -10);
    }
    @Tag("salem")
    @Test
    @DisplayName("test mul method")
    void testmul() {
        assertEquals(calculator.mul(10, 20), 200);
    }

    @Test
    @DisplayName("test div method")
    void testdiv() {
        assertEquals(calculator.div(100, 20), 5);
        assertEquals(calculator.div(100, -10), -10);
        Exception ex = assertThrowsExactly(ArithmeticException.class, () -> calculator.div(1, 0));

        assertEquals("cant divide by zero", ex.getMessage());

    }
  @EnabledOnOs (value = OS.WINDOWS)
    @Test
    @DisplayName("test Sqr method")
    void testSqr() {
        assertEquals(calculator.sqr(25), 5);
    }

    /*  @AfterEach // After each test case
      void  AfterEachTEstCase(){
          System.out.println("After each test case ");
      }*/
    @AfterAll
    static void AfterAll() {
        System.out.println(" run after all class one time");
    }
}