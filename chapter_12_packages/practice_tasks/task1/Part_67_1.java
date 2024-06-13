import calculator.*;

// Create three Classes Calculator, ScCalculator and HybridCalculator and group them into a package

public class Part_67_1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 10);
        ScCalculator scCalc = new ScCalculator(100);
        HybridCalculator hyCalc = new HybridCalculator(5, 10);

        System.out.printf("Sum: %d\n", calc.getSum());
        System.out.printf("Difference: %d\n", calc.getDifference());

        System.out.printf("Cube: %d\n", scCalc.getCube());
        System.out.printf("Logarithm: %.3f\n", scCalc.getLogarithm());
        System.out.printf("Square Root: %.3f\n", scCalc.getSquareRoot());

        System.out.printf("Product: %d", hyCalc.getProduct());
    }
}
