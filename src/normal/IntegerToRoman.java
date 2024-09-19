package normal;

// https://leetcode.com/problems/integer-to-roman/description/

public class IntegerToRoman {
    public static String convertSingleIntToRoman(int num) {
        if (num < 10) {
            if (num == 0) {
                return "";
            } else if (num <= 3) {
                return "I".repeat(num);
            } else if (num == 4) {
                return "IV";
            } else if (num <= 8) {
                return "V" + "I".repeat(num - 5);
            } else {
                return "IX";
            }

        } else if (num < 100) {
            if (num <= 30) {
                return "X".repeat(num/10);
            } else if (num == 40) {
                return "XL";
            } else if (num <= 80) {
                return "L" + "X".repeat((num - 50)/10);
            } else {
                return "XC";
            }

        } else if (num < 1000) {
            if (num <= 300) {
                return "C".repeat(num/100);
            } else if (num == 400) {
                return "CD";
            } else if (num <= 800) {
                return "D" + "C".repeat((num - 500)/100);
            } else {
                return "CM";
            }

        } else {
            return "M".repeat(num/1000);
        }
    }

    public static String intToRoman(int num) {
        String result = "";
        int level = 1;

        while (num != 0) {
            int offset = num % 10;
            num /= 10;
            result = convertSingleIntToRoman(offset * level) + result;
            level *= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}
