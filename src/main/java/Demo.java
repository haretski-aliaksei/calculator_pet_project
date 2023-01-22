public class Demo {
    public static void main(String[] args) {
        Calculator calculatorDemo = new Calculator();
        InputIntegerValidator inputIntegerValidator = new InputIntegerValidator();
        InputCharacterValidator inputCharacterValidator = new InputCharacterValidator();
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
        System.out.println(ServiceText.INPUT_FIRST_OPERAND.getServiceText());

        firstOperand = inputIntegerValidator.validateInputInteger(firstOperand);

        System.out.println(ServiceText.INPUT_SECOND_OPERAND.getServiceText());

        secondOperand = inputIntegerValidator.validateInputInteger(secondOperand);

        System.out.println(ServiceText.INPUT_CHARACTER.getServiceText());

        inputCharacterValidator.validateInputCharacter(calculatorDemo, firstOperand, secondOperand);
    }
}
