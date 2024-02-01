package ch1;

public class BitwiseEx2 {
    // 32비트 정수 n과 자릿수 k를 입력받는다.
    // k가 양수 : k위치에 있는 n의 비트 값을 1
    // k가 음수 : -k위치에 있는 n의 비트 값을 0
    // k가 0 : 위치 k에 있는 n의 비트 값을 0이면 1, 1이면 0으로
    public static void solution(int n, int k){
        if(k > 0){
            System.out.println((n | (1 << k)));
        } else if (k < 0) {
            System.out.println((n & ~(1 << -k)));
        }else{
            System.out.println(n ^ 1);
        }
    }
}
