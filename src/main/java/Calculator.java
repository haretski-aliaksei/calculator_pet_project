import java.math.BigInteger;

public class Calculator implements Runnable {
    public boolean isRun = true;

    public long produceAddingOfNumbers(int firstNumber, int secondNumber) {
        return (long) firstNumber + (long) secondNumber;
    }

    public int produceSubtractionOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public BigInteger produceMultiplicationOfNumbers(int firstNumber, int secondNumber) {
        BigInteger firstConvertedNumber = new BigInteger(String.valueOf(firstNumber));
        BigInteger secondConvertedNumber = new BigInteger(String.valueOf(secondNumber));
        return firstConvertedNumber.multiply(secondConvertedNumber);
    }

    public double produceDivisionOfNumbers(int firstNumber, int secondNumber) {
        return (double) firstNumber / (double) secondNumber;
    }

    @Override
    public void run() {

    }

    public boolean getIsRunStatus() {
        return isRun;
    }

    public void setIsRunToFalse() {
        this.isRun = false;
    }
}
