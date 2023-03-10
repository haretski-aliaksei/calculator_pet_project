import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIntegerValidator {
    /**
     * This method validates the data entered by the user through the console.
     *
     * @param operand operand entered by the user through the console in the Integer format
     * @return passed validation operand
     */
    public Integer validateInputInteger(Integer operand) {
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
                    System.out.println(ServiceText.INPUT_INTEGER_VALIDATION.getServiceText());
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        return operand;
    }
}
