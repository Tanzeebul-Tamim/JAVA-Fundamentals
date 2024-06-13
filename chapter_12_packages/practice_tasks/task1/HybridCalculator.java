package calculator;

public class HybridCalculator {
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
