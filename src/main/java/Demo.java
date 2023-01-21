import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        Thread demoThread = new Thread(calculatorDemo);
        Integer firstOperand = 0;
        Integer secondOperand = 0;
        String arithmeticOperation;

        while (calculatorDemo.getIsRunStatus()) {
            System.out.println("Hello world!");

            try {
                demoThread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("This is my pet-project named by \"Calculator\".");
            calculatorDemo.setIsRunToFalse();
        }

        System.out.println();
        System.out.println("With this console program, you can perform based on user input \n" +
                "the following arithmetic operations with two operands:\n" +
                "- addition;\n" +
                "- subtraction;\n" +
                "- multiplication;\n" +
                "- division.");

        System.out.println();
        System.out.println("So, let's start. \n" +
                "Please, input first operand in the Integer format (e.g. -256, 0, 128, and so on):");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean switcher = true;

            while (switcher) {
                try {
                    firstOperand = Integer.parseInt(br.readLine());

                    if (firstOperand instanceof Integer) {
                        switcher = false;
                    }

                } catch (NumberFormatException e) {
                    System.out.println();
                    System.out.println("The entered value is not an integer (e.g., -256, 0, 128, and so on).\n" +
                            "Enter an Integer value:");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        System.out.println("Please, input second operand in the Integer format (e.g. -256, 0, 128, and so on):");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean switcher = true;

            while (switcher) {
                try {
                    secondOperand = Integer.parseInt(br.readLine());

                    if (secondOperand instanceof Integer) {
                        switcher = false;
                    }

                } catch (NumberFormatException e) {
                    System.out.println();
                    System.out.println("The entered value is not an integer (e.g., -256, 0, 128, and so on).\n" +
                            "Enter an Integer value:");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        System.out.println("Please, input the character of the arithmetic operation.\n" +
                "Possible characters:\n" +
                "- for addition, type '+';\n" +
                "- for subtraction, type '-';\n" +
                "- for multiplication, type '*';\n" +
                "- for division, type '/'.");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean switcher = true;

            while (switcher) {
                arithmeticOperation = br.readLine();

                switch (arithmeticOperation) {
                    case "+":
                        System.out.println("\n***Result of arithmetic operation***");
                        System.out.printf("First operand (%d) %s second operand (%d) = %d \n",
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceAddingNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "-":
                        switcher = false;
                        break;
                    case "*":
                        switcher = false;
                        break;
                    case "/":
                        switcher = false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("The entered character isn't an arithmetic operation.\n" +
                                "Possible characters:\n" +
                                "- for addition, type '+';\n" +
                                "- for subtraction, type '-';\n" +
                                "- for multiplication, type '*';\n" +
                                "- for division, type '/'.\n" +
                                "Enter one from the possible character:");
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
