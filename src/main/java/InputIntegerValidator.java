import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputIntegerValidator {
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
