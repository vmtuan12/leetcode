package easy;

public class SqrtX {
    public static void main(String[] args) {
        int x = 2147483647;

        if (x < 2) {
            System.out.println(x);
        }

        int i = 2;
        while (i <= (x/2 + 1)) {
            long pow = (long) i *i;
            System.out.println(i + " " + pow);
            if (pow == x) {
                System.out.println(i);
                break;
            } else if (pow > x) {
                System.out.println(i - 1);
                break;
            }
            i++;
        }
    }
}
