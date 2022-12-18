public class Calculator implements Runnable {
    public boolean isRun = true;

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
