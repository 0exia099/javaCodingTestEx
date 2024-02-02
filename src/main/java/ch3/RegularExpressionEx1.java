package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx1 {
    // 휴대폰 번호를 입력 받는데, 입력 문자열이 010-dddd-dddd이 아닌 경우 오류 출력
    public static boolean solution(String num){
        String regex = "(010-[0-9]{4}-[0-9]{4})";
        return num.matches(regex);
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(num);
//        if(matcher.matches())
//            return true;
//        return false;
    }
}
