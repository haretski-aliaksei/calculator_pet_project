import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Demo {
    private static final Logger logger = LogManager.getLogger(Demo.class);

    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        InputIntegerValidator inputIntegerValidator = new InputIntegerValidator();
        InputCharacterValidator inputCharacterValidator = new InputCharacterValidator();
        NextOperation nextOperation = new NextOperation();
        Integer firstOperand = 0;
        Integer secondOperand = 0;

        while (calculatorDemo.getIsRunStatus()) {
            logger.info(ServiceText.HELLO_WORLD.getServiceText());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.debug(e.getMessage());
            }

            logger.info(ServiceText.INTRO_PET.getServiceText());
            calculatorDemo.setIsRunToFalse();
        }

        logger.info(ServiceText.INTRO_START.getServiceText());

        while (nextOperation.requestNextOperation) {
            logger.info(ServiceText.INPUT_FIRST_INTEGER_OPERAND.getServiceText());

            firstOperand = inputIntegerValidator.validateInputInteger(firstOperand);

            logger.info(ServiceText.INPUT_SECOND_INTEGER_OPERAND.getServiceText());

            secondOperand = inputIntegerValidator.validateInputInteger(secondOperand);

            logger.info(ServiceText.INPUT_CHARACTER.getServiceText());

            inputCharacterValidator.validateInputCharacter(calculatorDemo, firstOperand, secondOperand);
            nextOperation.suggestNextOperation();
        }
        logger.info(ServiceText.THANKS.getServiceText() + ServiceText.SMILE.getServiceText());
    }
}
