public class Calculator implements Runnable {
    public boolean isInterrupted = true;

    @Override
    public void run() {

    }

    public boolean getIsInterruptedStatus() {
        return isInterrupted;
    }

    public void setInterruptedToFalse() {
        this.isInterrupted = false;
    }
}
