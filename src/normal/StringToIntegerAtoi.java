package normal;

public class StringToIntegerAtoi {
    private static boolean charIsOperator(char c) {
        return c == '-' || c == '+';
    }

    private static boolean charIsDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        String s = "   +0 123";
        s = s.trim();
        boolean hasNumber = false;
        boolean encounterZeroFirst = false;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charIsDigit(c)) {
                if (c == '0' && result.toString().isEmpty()) {
                    encounterZeroFirst = true;
                    continue;
                }
                result.append(c);
                hasNumber = true;
            } else if (charIsOperator(c)) {
                if (!result.toString().isEmpty() || encounterZeroFirst) {
                    break;
                }
                result.append(c);
            } else {
                if (result.toString().isEmpty() || !hasNumber) {
                    System.out.println(0);
                    return;
                } else {
                    break;
                }
            }
        }

        String resultString = result.toString();
        try {
            System.out.println(Integer.parseInt(resultString));
        } catch (NumberFormatException e) {
            if (resultString.charAt(0) == '-') {
                System.out.println(Integer.MIN_VALUE);
            } else {
                System.out.println(Integer.MAX_VALUE);
            }
        }

    }
}
