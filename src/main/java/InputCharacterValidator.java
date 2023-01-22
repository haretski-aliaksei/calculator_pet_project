import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCharacterValidator {
    public void validateInputCharacter(Calculator calculatorDemo, Integer firstOperand, Integer secondOperand) {
        String arithmeticOperation;

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
}
