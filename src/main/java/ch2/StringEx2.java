package ch2;

public class StringEx2 {
    // 2개의 문자열 q와 p 입력. q또는 p에서 하나의 문자만 수정(추가, 삭제, 변경) 하여 다른 문자열을 만들 수 있는지 확인
    public static boolean solution(String q, String p){
        String shorter = q, longer = p;
        if(Math.abs(q.length() - p.length()) > 1)
            return false;
        if(q.length() > p.length()){
            shorter = p;
            longer = q;
        }
        boolean equalLen = q.length() == p.length();
        boolean count = false;
        int is = 0, il = 0;
        while (is < shorter.length() && il < longer.length()) {
            if (shorter.charAt(is) != longer.charAt(il)) {
                if (count)
                    return false;
                count = true;
                if (equalLen)
                    is += 1;
            }
            else
                is += 1;
            il += 1;
        }
        return true;
    }
}
