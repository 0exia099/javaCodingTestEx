package ch4;

import java.util.Arrays;

public class ArrayEx1 {
    // n개의 음수와 양수를 포함하는 정수 배열 A가 있다. 합이 주어진 숫자 k와 일치하는 모든 정수 쌍 구하기. 정렬된 리스트를 한번의 스캔으로 모든 해 구해야함.
    public static void solution(int[] arr, int k){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] == k){
                System.out.print("(" + arr[i] + ", " + arr[j]+")");
                i+=1;
                j-=1;
            }
            else if(arr[i] + arr[j] < k){
                i += 1;
            }else{
                j -= 1;
            }
        }
    }
}
