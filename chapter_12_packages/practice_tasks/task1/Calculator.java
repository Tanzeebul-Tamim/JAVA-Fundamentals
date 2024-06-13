package calculator;

public class Calculator {
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
