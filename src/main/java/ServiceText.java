public enum ServiceText {
    HELLO_WORLD("Hello world!"),
    INTRO_PET("This is my pet-project named by \"Calculator\"."),
    INTRO_OPERATIONS("\nWith this console program, you can perform based on user input \n" +
            "the following arithmetic operations with two operands:\n" +
            "- addition;\n" +
            "- subtraction;\n" +
            "- multiplication;\n" +
            "- division."),
    INTRO_START("\nSo, let's start.\n"),
    INPUT_FIRST_OPERAND("Please, input FIRST operand in the Integer format (e.g. -256, 0, 128, and so on).\n" +
            "MIN value: -2,147,483,648\n" +
            "MAX value: 2,147,483,647\n" +
            "Input value:"),
    INPUT_SECOND_OPERAND("Please, input SECOND operand in the Integer format (e.g. -256, 0, 128, and so on):\n" +
            "MIN value: -2,147,483,648\n" +
            "MAX value: 2,147,483,647\n" +
            "Input value:"),
    INPUT_CHARACTER("Please, input the character of the arithmetic operation.\n" +
            "Possible characters:\n" +
            "- for addition, type '+';\n" +
            "- for subtraction, type '-';\n" +
            "- for multiplication, type '*';\n" +
            "- for division, type '/'.\n" +
            "Input a character:"),
    INPUT_INTEGER_VALIDATION("\nThe entered value is not an integer (e.g., -256, 0, 128, and so on).\n" +
            "Enter an Integer value:"),
    RESULT_OPERATION_TEXT_DEFAULT("\n***Result of arithmetic operation***"),
    RESULT_OPERATION_TEXT_DECIMAL_INTEGERS("First operand (%d) %s second operand (%d) = %d\n"),
    RESULT_OPERATION_TEXT_FLOATING_POINTS_NUMBER("First operand (%d) %s second operand (%d) = %f\n"),
    CHARACTER_VALIDATOR_SWITCH_DEFAULT("\nThe entered character isn't an arithmetic operation.\n" +
            "Possible characters:\n" +
            "- for addition, type '+';\n" +
            "- for subtraction, type '-';\n" +
            "- for multiplication, type '*';\n" +
            "- for division, type '/'.\n" +
            "Enter one from the possible character:"),
    CHARACTER_VALIDATOR_ZERO_DIVISION_FORBIDDEN("Second operand equals \"0\". You can't divide by zero.");

    private String serviceText;

    ServiceText(String serviceText) {
        this.serviceText = serviceText;
    }

    public String getServiceText() {
        return serviceText;
    }
}
