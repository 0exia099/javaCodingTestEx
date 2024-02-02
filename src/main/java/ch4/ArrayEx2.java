package ch4;

import java.util.Arrays;

public class ArrayEx2 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/68645
    public static int[] solution(int n) {
        int[][] answer = new int[n][n];
        int x = -1;
        int y = 0;
        int num = 1;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                if(i % 3 == 0) {
                    x++;
                }
                else if(i % 3 == 1) {
                    y++;
                }
                else if(i % 3 == 2) {
                    x--;
                    y--;
                }
                answer[x][y] = num;
                num++;
            }
        }
        int[] result = new int[n*(n+1) / 2];

        num = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                result[num] = answer[i][j];
                num++;
            }
        }

        return result;
    }
}
