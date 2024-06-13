package calculator;

public class ScCalculator {
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