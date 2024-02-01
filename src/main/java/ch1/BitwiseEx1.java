package ch1;

public class BitwiseEx1 {
    // 32비트 정수 n과 자릿수 k를 입력받아 위치 k에 있는 n의 비트 값을 출력
    public static void solution(int n, int k){
        System.out.println((n & (1 << k)) == 0 ? 0 : 1);
//        System.out.println(1 & (n >> k));
    }
}
