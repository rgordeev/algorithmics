package challenges.codility.p14;

/**
 * Created by rgordeev on 21.07.16.
 *
 *
 *
 */
public class Solution {

    public int solution(int X, int[] A) {

        int same = 0;
        int diff = 0;
        int n    = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] != X) diff += 1;
        }

        if (same == diff) return 1;
        if (diff == n)    return n;

        for (int i = 0; i < n; i++) {
            if (A[i] == X) {
                same += 1;
                if (same == diff) return i + 1;
            }
            //if (A[i] == X) same += 1;
            if (A[i] != X) diff -= 1;
            if (same == diff) return i + 1;
        }

        return 1;
    }

}