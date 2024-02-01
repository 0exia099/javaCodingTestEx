package ch2;

public class StringEx3 {
    // 2개의 문자열 str1과 str2 입력. str1을 회전하여 str2를 만들 수 있는지 확인
    public static boolean solution(String str1, String str2){
        if(str1.length() != str2.length())
            return false;
        String temp = str1.concat(str1);
        return temp.contains(str2);
    }
}
