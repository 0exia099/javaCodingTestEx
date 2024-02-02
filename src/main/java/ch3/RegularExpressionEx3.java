package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx3 {
    // 정수 3자리마다 ,
    public static String solution(String num){
        String regex = "([0-9]+)([0-9]{3})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(num);
        String result = "";
        while(matcher.find()){
            result = matcher.replaceAll("$1,$2");
            matcher.reset(result);
        }
        return result;
    }
}
