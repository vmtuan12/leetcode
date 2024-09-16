package easy;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {

    public int climbStairs(int n) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(2);

        for (int i = 3; i <= n; i++) {
            int prev1 = l.get(i - 1);
            int prev2 = l.get(i - 2);
            l.add(prev1 + prev2);
        }
        return l.get(n);
    }

    public static void main(String[] args) {
        int x = 100;
        System.out.println(new ClimbingStairs().climbStairs(x));
    }
}
