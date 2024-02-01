package ch2;

public class StringEx1 {
    // 문자열이 고유 문자만 포함될 경우 true를 반환하는 코드를 작성하라. 공백 무시
    public static boolean solution(String str){
        for(int i = 0; i < str.length(); i++){
            char temp = str.charAt(i);
            if(temp == ' ')
                continue;
            if(str.lastIndexOf(temp) != i)
                return false;
        }
        return true;
    }
}
