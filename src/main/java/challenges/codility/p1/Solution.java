package challenges.codility.p1;

/**
 * User: rgordeev
 * Date: 23.06.16
 * Time: 14:17
 */
class Solution {

    public int solution(int[] A) {

        long summ = sum(A);

        long tail = summ;
        long lead = 0;

        for (int i = 0; i < A.length; i++)
        {
            tail = tail - A[i];
            lead = summ - tail - A[i];

            if (tail == lead) return i;
        }

        return -1;
    }

    protected long sum(int[] list, int from, int to) {
        if (from >= to) return 0L;
        long acc = 0L;
        for (int i = from; i < to; i++)
            acc += list[i];
        return acc;
    }

    protected long sum(int[] list) {
        if (list == null || list.length == 0)
            return 0L;
        else {
            long acc = 0L;
            for (int i = 0; i < list.length; i++)
                acc = acc + list[i];
            return acc;
        }
    }

    public static void main(String[] arg)
    {
        int[] a = {-1, 2, -4, 5, 1, -6, 2, 1};

        System.out.println(new Solution().solution(a));
    }
}