public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        Thread demoThread = new Thread(calculatorDemo);

        while (calculatorDemo.getIsRunStatus()) {
            System.out.println("Hello world!");

            try {
                demoThread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("This is my first pet-project named by \"Calculator\"");
            calculatorDemo.setIsRunToFalse();
        }
    }
}
