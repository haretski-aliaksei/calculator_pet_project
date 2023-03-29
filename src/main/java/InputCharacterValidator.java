import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputCharacterValidator {
    private static final Logger logger = LogManager.getLogger(InputCharacterValidator.class);

    /**
     * This method validates the data entered by the user through the console.
     * Valid input values are:
     * - "+";
     * - "-";
     * - "*";
     * - "/".
     *
     * @param calculatorDemo object of "Calculator" class
     * @param firstOperand   the first operand entered by the user through the console
     * @param secondOperand  the second operand entered by the user through the console
     */
    public void validateInputCharacter(Calculator calculatorDemo, Integer firstOperand, Integer secondOperand) {
        String arithmeticOperation;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            boolean switcher = true;

            while (switcher) {
                arithmeticOperation = br.readLine();

                switch (arithmeticOperation) {
                    case "+":
                        System.out.println(ServiceText.RESULT_OPERATION_TEXT_DEFAULT.getServiceText());
                        System.out.printf(ServiceText.RESULT_OPERATION_TEXT_DECIMAL_INTEGERS.getServiceText(),
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceAddingOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "-":
                        System.out.println(ServiceText.RESULT_OPERATION_TEXT_DEFAULT.getServiceText());
                        System.out.printf(ServiceText.RESULT_OPERATION_TEXT_DECIMAL_INTEGERS.getServiceText(),
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceSubtractionOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "*":
                        System.out.println(ServiceText.RESULT_OPERATION_TEXT_DEFAULT.getServiceText());
                        System.out.printf(ServiceText.RESULT_OPERATION_TEXT_DECIMAL_INTEGERS.getServiceText(),
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceMultiplicationOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    case "/":
                        if (secondOperand == 0) {
                            System.out.println(ServiceText.CHARACTER_VALIDATOR_ZERO_DIVISION_FORBIDDEN.getServiceText());
                            switcher = false;
                            break;
                        }

                        System.out.println(ServiceText.RESULT_OPERATION_TEXT_DEFAULT.getServiceText());
                        System.out.printf(ServiceText.RESULT_OPERATION_TEXT_FLOATING_POINTS_NUMBER.getServiceText(),
                                firstOperand, arithmeticOperation, secondOperand,
                                calculatorDemo.produceDivisionOfNumbers(firstOperand, secondOperand));
                        switcher = false;
                        break;
                    default:
                        logger.info(ServiceText.CHARACTER_VALIDATOR_ERROR_MESSAGE.getServiceText());
                        System.out.println(ServiceText.CHARACTER_VALIDATOR_SWITCH_DEFAULT.getServiceText());
                }
            }
        } catch (IOException exception) {
            logger.debug(exception.getMessage());
        }
    }
}
