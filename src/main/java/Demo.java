public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        InputIntegerValidator inputIntegerValidator = new InputIntegerValidator();
        InputCharacterValidator inputCharacterValidator = new InputCharacterValidator();
        NextOperation nextOperation = new NextOperation();
        Integer firstOperand = 0;
        Integer secondOperand = 0;

        while (calculatorDemo.getIsRunStatus()) {
            System.out.println(ServiceText.HELLO_WORLD.getServiceText());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(ServiceText.INTRO_PET.getServiceText());
            calculatorDemo.setIsRunToFalse();
        }

        System.out.println(ServiceText.INTRO_START.getServiceText());

        while (nextOperation.requestNextOperation) {
            System.out.println(ServiceText.INPUT_FIRST_INTEGER_OPERAND.getServiceText());

            firstOperand = inputIntegerValidator.validateInputInteger(firstOperand);

            System.out.println(ServiceText.INPUT_SECOND_INTEGER_OPERAND.getServiceText());

            secondOperand = inputIntegerValidator.validateInputInteger(secondOperand);

            System.out.println(ServiceText.INPUT_CHARACTER.getServiceText());

            inputCharacterValidator.validateInputCharacter(calculatorDemo, firstOperand, secondOperand);
            nextOperation.suggestNextOperation();
        }
        System.out.printf(ServiceText.THANKS.getServiceText(), ServiceText.SMILE.getServiceText());
    }
}
