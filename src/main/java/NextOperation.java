import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextOperation {
    public boolean requestNextOperation = true;

    /**
     * This method is used to prompt the user to perform the next operation or terminate the program
     */
    public void suggestNextOperation() {
        try {
            System.out.println(ServiceText.SUGGEST_NEXT_OPERATION.getServiceText());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String text = br.readLine();

            if (!(text.equals("Yes") || text.equals("yes") || text.equals("YES"))) {
                requestNextOperation = false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
