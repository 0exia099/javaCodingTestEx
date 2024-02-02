package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx4 {
    // 공백, a~z, 0~9 등의 문자로 이루어진 문자열을 입력 받는다. 이 문자열에서 정수를 추출하는 코드 작성
    public static String solution(String str){
        String reg = "([0-9]*)";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        StringBuilder sb = new StringBuilder();
        while(matcher.find()) {
            sb.append(matcher.group().equals("") ? "":matcher.group()+", ");
        }
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
    }
}
