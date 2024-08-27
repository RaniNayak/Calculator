

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Testing in progress for Calculator");
    }
    @Test
    @DisplayName("Testcase for Basic Operations")
    public void testBasicOperations() {
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Testcase for Basic Operations");

        Calculator calc = new Calculator();

        assertEquals(5.0, calc.calculate(Operation.ADD, 2.0, 3.0));
        assertEquals(-1.0, calc.calculate(Operation.SUBTRACT, 2.0, 3.0));
        assertEquals(6.0, calc.calculate(Operation.MULTIPLY, 2.0, 3.0));
        assertEquals(2.0, calc.calculate(Operation.DIVIDE, 6.0, 3.0));

        // Test divide by zero
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.calculate(Operation.DIVIDE, 1.0, 0.0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());

        // Test invalid operation
        Exception invalidOpException = assertThrows(IllegalArgumentException.class, () -> {
            calc.calculate(null, 1.0, 1.0);
        });
        assertEquals("Operation not supported", invalidOpException.getMessage());
    }

    @Test
    @DisplayName("Testcase for Chaining Operations")
    public void testChainingOperations() {
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Testcase for Chaining Operations");

        Calculator calc = new Calculator();
        Operation[] ops = { Operation.ADD, Operation.MULTIPLY };
        double[] values = { 3.0, 2.0 };

        assertEquals(16.0, calc.chain(5.0, ops, values));
    }

    @Test
    @DisplayName("Testcase for Extending Operations")
    public void testExtensibleCalculator() {
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Testcase for Extending Operations");

        Calculator calc = new Calculator();
       // calc.addOperation(Operation.ADD, (a, b) -> a + b);
       // calc.addOperation(Operation.SUBTRACT, (a, b) -> a - b);

        // Adding a new operation (POWER)
        calc.addOperation(Operation.valueOf("POWER"), (a, b) -> Math.pow(a, b));


        // Test POWER operation
        assertEquals( 27.0, calc.calculate(Operation.valueOf("POWER"), 3.0, 3.0));
    }

    @AfterAll
    public  static void tearDown() {
        System.out.println("----------------------------------------------------------------------------");

        System.out.println("Tearing down the test setup for Calculator.");
        System.out.println("----------------------------------------------------------------------------");

    }
}
