import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIntegerValidator {
    private static final Logger logger = LogManager.getLogger(InputIntegerValidator.class);

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
                    logger.debug(e.getMessage());
                    System.out.println(ServiceText.INPUT_INTEGER_VALIDATION.getServiceText());
                }
            }
        } catch (IOException exception) {
            logger.debug(exception.getMessage());
        }

        System.out.println();
        return operand;
    }
}
