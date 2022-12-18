public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        Thread demoThread = new Thread(calculatorDemo);

        while (calculatorDemo.getIsInterruptedStatus()) {
            System.out.println("Hello world!");

            try {
                demoThread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("This is my first pet-project named by \"Calculator\"");
            calculatorDemo.setInterruptedToFalse();
        }
    }
}
