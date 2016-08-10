package challenges.codility.p15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by rgordeev on 21.07.16.
 */
public class Solution {

    class Point {
        private int x;
        private int y;
        private boolean visited;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
            this.visited = false;
        }
    }

    public ArrayList<Point> adj(int i, int j) {
        ArrayList<Point> result = new ArrayList<Point>();
        result.add(new Point(i - 2, j - 1));
        result.add(new Point(i - 1, j - 2));
        result.add(new Point(i + 1, j - 2));
        result.add(new Point(i + 2, j - 1));
        result.add(new Point(i - 2, j + 1));
        result.add(new Point(i - 1, j + 2));
        result.add(new Point(i + 1, j + 2));
        result.add(new Point(i + 2, j + 1));

        return result;
    }

    public int solution(int A, int B) {
        int i = 0;
        int j = 0;
        if(i == A && j == B)
            return 0;

        int[][] desk = new int[Integer.MAX_VALUE][Integer.MAX_VALUE];
        desk[0][0] = 0;

        for(Point p : adj(i, j)){
            p.visited = true;
        }

        for(i = - 1; i <= A - 1; i++) {
            for(j = - 1; j <= B-1; j++) {
                desk[i][j] = -1;
            }

        }
        return desk[A][B];

    }

}