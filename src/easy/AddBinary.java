package easy;// https://leetcode.com/problems/add-binary/description/

public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        StringBuilder result = new StringBuilder();

        int p1 = a.length() - 1;
        int p2 = b.length() - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0) {
            int c1 = 0;
            int c2 = 0;
            if (p1 >= 0) {
                c1 = a.charAt(p1--) - '0';
            }
            if (p2 >= 0) {
                c2 = b.charAt(p2--) - '0';
            }
            int sum = c1 + c2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        System.out.println(result.reverse().toString());
    }
}