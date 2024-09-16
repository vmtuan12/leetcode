package normal;

// https://leetcode.com/problems/longest-palindromic-substring/description/

public class LongestPalindromicSubstring {
    private static class Tuple {
        int start, end;
        public Tuple(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "(" + start + ", " + end + ")";
        }
    }

    private static Tuple isPalindromic(String s, int startLeft, int startRight) {
        while (true) {
            startLeft--;
            if (startLeft < 0) {
                startLeft++;
                break;
            }
            startRight++;
            if (startRight >= s.length()) {
                startLeft++;
                startRight--;
                break;
            }
            if (s.charAt(startLeft) != s.charAt(startRight)) {
                return new Tuple(++startLeft, --startRight);
            }
        }

        return new Tuple(startLeft, startRight);
    }

    public static void main(String[] args) {
        String s = "aaaa";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            Tuple tuple = null;
            if (i > 0 && s.charAt(i + 1) == s.charAt(i - 1)) {
                tuple = isPalindromic(s, i - 1, i + 1);
                if ((tuple.end - tuple.start) > (end - start)) {
                    end = tuple.end;
                    start = tuple.start;
                }
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + " " + (i + 1));
                tuple = isPalindromic(s, i, i + 1);
                if ((tuple.end - tuple.start) > (end - start)) {
                    end = tuple.end;
                    start = tuple.start;
                }
            }
        }

        System.out.println(start + " " + end);

    }
}
