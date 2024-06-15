package calculator;

// Create three Classes Calculator, ScCalculator and HybridCalculator and group them into a package

/*
    * Commands used:

    1. javac -d . .\Part_67_1.java //* for compiling
    2. java calculator/Part_67_1 //* for executing
 */

class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getDifference() {
        int result = num1 - num2;
        int resultAbs = Math.abs(result);
        return resultAbs;
    }
}


class ScCalculator {
    private int num;

    public ScCalculator(int num) {
        this.num = num;
    }

    public int getCube() {
        int result = (int) Math.pow(num, 3);
        return result;
    }

    public double getLogarithm() {
        double result = Math.log10(num);
        return result;
    }

    public double getSquareRoot() {
        double result = Math.sqrt(num);
        return result;
    }
}

class HybridCalculator {
    private int num1;
    private int num2;

    public HybridCalculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getProduct() {
        return num1 * num2;
    }
}


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
