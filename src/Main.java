import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public boolean validPhoneNumber(String phoneNumber) {
//        int validatorCount = 0;
//        String[] firstPart = phoneNumber.split(" ");
//        if (firstPart[0].length() == 5) {
//            validatorCount += 1;
//        } else {
//            return false;
//        }
//        if (firstPart[1].contains("-")) {
//            String[] secondPart = firstPart[1].split("-");
//            if (secondPart[0].length() == 3 & secondPart[1].length() == 4) {
//                validatorCount += 1;
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//
//        return (validatorCount == 2);
        /*        The best solution phoneNumber.matches("\\(\\d{3}\\)(\\s)\\d{3}-\\d{4}");
            \\( --- Start with an "("
           (\\d{3}) --- Followed by 3 digits
            \\) --- Have an ")"
            (\\s) --- Have an space
            (\\d{3}) --- Followed by 3 digits.
            (\\-) --- Have a "-" after numeric digits
            (\\d{4}) - Ends with four digits
*/
        return phoneNumber.matches("\\(\\d{3}\\)\\s\\d{3}\\-\\d{4}");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Main main = new Main();
        System.out.println(main.validPhoneNumber("(123) 456-7890"));
        System.out.println(main.validPhoneNumber("(1111)555 2345"));
        System.out.println(main.validPhoneNumber("(098) 123 4567"));


    }
}

