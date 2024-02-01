package ch2;

public class StringEx4 {
    // 자연수 n, n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 반환
    // https://school.programmers.co.kr/learn/courses/30/lessons/68935
    public static int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}
