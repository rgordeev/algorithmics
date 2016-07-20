package challenges.codility.p5;

/**
 * Created by rgordeev on 04.07.16.
 */
class Solution {
    public int solution(int N) {

        int [] bin = binary(N);

        boolean start   = false;
        int gap         = 0;
        int maxgap      = 0;

        for (int i = 0; i < bin.length; i++)
        {
            if (bin[i] == 1 && start) {
                start   = false;
                maxgap  = maxgap >= gap ? maxgap : gap;
            }
            if (bin[i] == 1 && !start) {
                gap     = 0;
                start   = true;
            }
            if (bin[i] == 0 && start) gap = gap + 1;
        }

        return maxgap;
    }

    public int[] binary(int n) {
        int [] bin = new int[size(n)];
        int i = 0;
        while (n > 0)
        {
            bin[i] = n % 2;
            n = n / 2;
            i = i + 1;
        }
        return bin;
    }


    public int size(int n) {
        int i = 0;
        while (n > 0) {
            i = i + 1;
            n = n / 2;
        }
        return i;
    }


    public static void main(String [] args)
    {
        Solution s = new Solution();
        int n = 1904244666;
        for (int i = 0; i < s.binary(n).length; i++)
            System.out.print(s.binary(n)[i]);
        System.out.println();
        System.out.println(s.solution(n));
    }
}