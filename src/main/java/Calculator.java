public class Calculator implements Runnable {
    public boolean isRun = true;

    public Integer produceAddingNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    //public

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
