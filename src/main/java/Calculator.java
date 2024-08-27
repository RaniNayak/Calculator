
import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class Calculator {

    private final Map<Operation, BinaryOperator<Double>> operations = new HashMap<>();

    public Calculator() {
        // Initialize with default operations
        operations.put(Operation.ADD, (a, b) -> a + b);
        operations.put(Operation.SUBTRACT, (a, b) -> a - b);
        operations.put(Operation.MULTIPLY, (a, b) -> a * b);
        operations.put(Operation.DIVIDE, (a, b) -> {
            if (b == 0) throw new ArithmeticException("Cannot divide by zero");
            return a / b;
        });
    }

    public double calculate(Operation op, double num1, double num2) {
        BinaryOperator<Double> operation = operations.get(op);
        if (operation == null) {
            throw new IllegalArgumentException("Operation not supported");
        }
        return operation.apply(num1, num2);
    }

    public double chain(double initialValue, Operation[] ops, double[] values) {
        double result = initialValue;
        for (int i = 0; i < ops.length; i++) {
            result = calculate(ops[i], result, values[i]);
        }
        return result;
    }

    public void addOperation(Operation op, BinaryOperator<Double> operation) {
        operations.put(op, operation);
    }
}
