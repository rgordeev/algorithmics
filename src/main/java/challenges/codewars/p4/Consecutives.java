package challenges.codewars.p4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by rgordeev on 30.06.16.
 */
public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<List<Integer>> chunks = new ArrayList<>();
        for (int i = 0; i < s.size(); )
        {
            List<Integer> chunk = new ArrayList<>();
            int j = i;
            while (j < s.size() && s.get(i).equals(s.get(j)))
            {
                chunk.add(s.get(j));
                j++;
            }
            chunks.add(chunk);
            i = j;
        }
        return chunks.stream().map(it -> it.stream().reduce(0, (a,b) -> a + b)).collect(Collectors.toList());
    }
}
