import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2};

        int arrLen = arr.length;
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, -1)));
    }
}
