import java.util.Arrays;

// https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9, 9, 9};

        boolean save = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (save || i == digits.length - 1) {
                digits[i] += 1;
                save = false;
            }

            if (digits[i] == 10) {
                save = true;
                digits[i] = 0;
            }
        }

        if (save) {
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            System.arraycopy(digits, 0, newDigits, 1, digits.length);

            System.out.println(Arrays.toString(newDigits));
        } else {
            System.out.println(Arrays.toString(digits));
        }
    }
}