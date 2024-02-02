package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx2 {
    // MM/DD/YYYY 형식으로 표기된 날짜를 입력받은 후 YYYYMMDD로 변경
    public static String solution(String dateStr){
        String regex = "([0-9]{2})/([0-9]{2})/([0-9]{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dateStr);
        matcher.find();
        return matcher.group(3) + matcher.group(1) + matcher.group(2);
    }
}
