package ch9;

import java.util.Arrays;

public class DPEx1 {
    public static void solution(int[] a){
        int[] arr = new int[a.length];
//        Arrays.fill(arr,0);
        arr[0] = a[0];
        arr[1] = a[1];
        for(int i = 2; i<a.length;i++){
            arr[i] = Math.max(arr[i-1], arr[i-2] + a[i]);
        }
        System.out.println(arr[a.length-1]);
    }
}
