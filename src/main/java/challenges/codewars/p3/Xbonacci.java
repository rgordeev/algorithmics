package challenges.codewars.p3;

import java.util.Arrays;

/**
 * Created by rgordeev on 30.06.16.
 */
public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if (n == 0)
            return new double[0];
        else if (n > 0 && n <= 2)
            return Arrays.copyOf(s, n);
        double[] result = new double[n];
        for (int i = 0; i < n; i++)
            if (i <= 2) result[i] = s[i];
            else result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        return result;
    }

    public static void main(String[] args) {
        double[] a = new Xbonacci().tribonacci(new double[]{1,1,1}, 10);

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
