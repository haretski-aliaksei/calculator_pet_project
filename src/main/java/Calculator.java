import java.math.BigInteger;

public class Calculator implements Runnable {
    private boolean isRun = true;

    /**
     * This method produce arithmetic addition of two operands
     *
     * @param firstNumber first argument in the Integer format
     * @param secondNumber second argument in the Integer format
     * @return result of arithmetic addition of two operands in the Long format
     */
    public long produceAddingOfNumbers(int firstNumber, int secondNumber) {
        return (long) firstNumber + (long) secondNumber;
    }

    /**
     * This method produce arithmetic subtraction of two operands
     *
     * @param firstNumber first argument in the Integer format
     * @param secondNumber second argument in the Integer format
     * @return result of arithmetic subtraction of two operands in the int format
     */
    public int produceSubtractionOfNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * This method produce arithmetic multiplication of two operands
     *
     * @param firstNumber first argument in the Integer format
     * @param secondNumber second argument in the Integer format
     * @return result of arithmetic subtraction of two operands in the BigInteger format
     */
    public BigInteger produceMultiplicationOfNumbers(int firstNumber, int secondNumber) {
        BigInteger firstConvertedNumber = new BigInteger(String.valueOf(firstNumber));
        BigInteger secondConvertedNumber = new BigInteger(String.valueOf(secondNumber));
        return firstConvertedNumber.multiply(secondConvertedNumber);
    }

    /**
     * This method produce arithmetic division of two operands
     *
     * @param firstNumber first argument in the Integer format
     * @param secondNumber second argument in the Integer format
     * @return result of arithmetic subtraction of two operands in the double format
     */
    public double produceDivisionOfNumbers(int firstNumber, int secondNumber) {
        return (double) firstNumber / (double) secondNumber;
    }

    /**
     * This is override method of "Runnable" interface
     */
    @Override
    public void run() {

    }

    /**
     * This method is used for getting current status of Thread
     *
     * @return current status of Thread
     */
    public boolean getIsRunStatus() {
        return isRun;
    }

    /**
     * This method is used for changing of status for current Thread
     */
    public void setIsRunToFalse() {
        this.isRun = false;
    }
}
