package ch1;

public class BitwiseEx4 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17681
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++){
            String temp = "";
            for (int j = n-1; j>=0;j--){
                temp += ((arr1[i] | arr2[i]) >> j & 1) == 0 ? " " : "#";
            }
            answer[i] = temp;
        }
        return answer;
    }
}
