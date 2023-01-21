import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        Integer firstOperand = 0;
        Integer secondOperand = 0;
        String arithmeticOperation;

        while (calculatorDemo.getIsRunStatus()) {
            System.out.println("Hello world!");

            try {
                Thread.sleep(1000);
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
                "Please, input first operand in the Integer format (e.g. -256, 0, 128, and so on).\n" +
                "MIN value: -2,147,483,648\n" +
                "MAX value: 2,147,483,647\n" +
                "Input value:");

        firstOperand = getInteger(firstOperand);

        System.out.println("Please, input second operand in the Integer format (e.g. -256, 0, 128, and so on):\n" +
                "MIN value: -2,147,483,648\n" +
                "MAX value: 2,147,483,647\n" +
                "Input value:");

        secondOperand = getInteger(secondOperand);

        System.out.println("Please, input the character of the arithmetic operation.\n" +
                "Possible characters:\n" +
                "- for addition, type '+';\n" +
                "- for subtraction, type '-';\n" +
                "- for multiplication, type '*';\n" +
                "- for division, type '/'.\n" +
                "Input value:");

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
                                calculatorDemo.produceAddingOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "-":
                        System.out.println("\n***Result of arithmetic operation***");
                        System.out.printf("First operand (%d) %s second operand (%d) = %d \n",
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceSubtractionOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "*":
                        System.out.println("\n***Result of arithmetic operation***");
                        System.out.printf("First operand (%d) %s second operand (%d) = %d \n",
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceMultiplicationOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "/":
                        if (secondOperand == 0) {
                            System.out.println("Second operand equals \"0\". You can't divide by zero");
                            switcher = false;
                            break;
                        }

                        System.out.println("\n***Result of arithmetic operation***");
                        System.out.printf("First operand (%d) %s second operand (%d) = %f\n",
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceDivisionOfNumbers(firstOperand, secondOperand));
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

    private static Integer getInteger(Integer operand) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean switcher = true;

            while (switcher) {
                try {
                    operand = Integer.parseInt(br.readLine());

                    if (operand instanceof Integer) {
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
        return operand;
    }
}
