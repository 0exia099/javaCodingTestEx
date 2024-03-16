package ch5;

import java.util.ArrayList;

public class RecursionEx1 {
    // 하노이
    public static ArrayList<int[]> result = new ArrayList<int[]>();
    public static void hanoi(int n, int from, int middle, int to){
        if(n == 1){
            result.add(new int[]{from, to});
            return;
        }

        hanoi(n-1, from, to, middle);
        result.add(new int[]{from, to});
        hanoi(n-1, middle, from, to);
    }
    public static int[][] solution(int n){
        hanoi(n, 1,2,3);
        return result.toArray(new int[result.size()][]);
    }
}
