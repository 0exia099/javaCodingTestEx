package ch1;

public class BitwiseEx3 {
    // 32비트 정수 q와 p, 그리고 위치 x와 y를 입력받는다.(x<y)
    // q의 비트에서 x와 y사이의 비트를 p의 비트로 대체
    // 단, x와 y사이에 p의 모든 비트를 넣을 수 있다고 가정
    public static void solution(int q, int p, int x, int y){
        System.out.println(Integer.toBinaryString(q));
        System.out.println(Integer.toBinaryString(p));
        System.out.println(q & ~((((1 << y) - 1) >> x) << x) | (p << x));
    }
}
