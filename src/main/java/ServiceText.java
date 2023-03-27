public enum ServiceText {
    HELLO_WORLD("Hello world!"),
    INTRO_PET("This is my pet-project named by \"Calculator\"."),
    INTRO_START("\nWith this console program, you can perform based on user input\n" +
            "the following arithmetic operations with two operands:\n" +
            "- addition (+);\n" +
            "- subtraction (-);\n" +
            "- multiplication (*);\n" +
            "- division (/).\n" +
            "\nSo, let's start."),
    INPUT_FIRST_INTEGER_OPERAND("\nPlease, input FIRST operand in the Integer format (e.g. -256, 0, 128, and so on).\n" +
            "MIN value: -2,147,483,648\n" +
            "MAX value: 2,147,483,647\n" +
            "Input value:"),
    INPUT_SECOND_INTEGER_OPERAND("Please, input SECOND operand in the Integer format (e.g. -256, 0, 128, and so on):\n" +
            "MIN value: -2,147,483,648\n" +
            "MAX value: 2,147,483,647\n" +
            "Input value:"),
    INPUT_INTEGER_VALIDATION("\nThe entered value is not an integer (e.g., -256, 0, 128, and so on).\n" +
            "Enter an Integer value:"),
    INPUT_CHARACTER("Please, input the character of the arithmetic operation.\n" +
            "Possible characters:\n" +
            "- for addition, type '+';\n" +
            "- for subtraction, type '-';\n" +
            "- for multiplication, type '*';\n" +
            "- for division, type '/'.\n" +
            "Input a character:"),
    CHARACTER_VALIDATOR_SWITCH_DEFAULT("\nThe entered character isn't an arithmetic operation.\n" +
            "Possible characters:\n" +
            "- for addition, type '+';\n" +
            "- for subtraction, type '-';\n" +
            "- for multiplication, type '*';\n" +
            "- for division, type '/'.\n" +
            "Enter one from the possible character:"),
    CHARACTER_VALIDATOR_ZERO_DIVISION_FORBIDDEN("Second operand equals \"0\". You can't divide by zero."),
    RESULT_OPERATION_TEXT_DEFAULT("\n***Result of arithmetic operation***"),
    RESULT_OPERATION_TEXT_DECIMAL_INTEGERS("First operand (%d) %s second operand (%d) = %d\n"),
    RESULT_OPERATION_TEXT_FLOATING_POINTS_NUMBER("First operand (%d) %s second operand (%d) = %f\n"),
    SUGGEST_NEXT_OPERATION("\nDo you want to produce next operation?\nType \"Yes\" for continue:"),
    THANKS("\nThank you for choosing best calculator ever! \n"),
    SMILE("☺");

    private String serviceText;

    ServiceText(String serviceText) {
        this.serviceText = serviceText;
    }

    public String getServiceText() {
        return serviceText;
    }
}
