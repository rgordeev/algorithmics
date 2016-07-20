package challenges.codility.p2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rgordeev on 30.06.16.
 */
public class Solution {

    public int solution(int[] A) {

        Map<Integer, Integer> counts = new HashMap<>(A.length);
        Integer one = new Integer(1);

        for (int i = 0; i < A.length; i++)
        {
            Integer value = new Integer(A[i]);
            Integer count = counts.get(value);

            if (count == null) counts.put(value, one);
            else counts.put(value, count + one);
        }


        return counts.entrySet().stream()
                .filter(it -> it.getValue() % 2 != 0)
                .map(it -> it.getKey())
                .findFirst().orElse(-1);
    }
}