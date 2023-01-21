import java.text.DecimalFormat;

public class Calculator implements Runnable {
    public boolean isRun = true;

    public int produceAddingOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int produceSubtractionOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int produceMultiplicationOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
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
