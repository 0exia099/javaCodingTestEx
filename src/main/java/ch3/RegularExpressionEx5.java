package ch3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx5 {
    // https://school.programmers.co.kr/learn/courses/30/lessons/17682
    public static int solution(String dartResult){
        int answer = 0;
        String reg = "(([0-9]*)([SDT])([\\*#]*))";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(dartResult);
        int before = 0;
        int now = 0;
        while(matcher.find()){
            now = Integer.parseInt(matcher.group(2));
            if(matcher.group(3).equals("S")){
                now = now * 1;
            }else if(matcher.group(3).equals("D")){
                now = now*now;
            }else if(matcher.group(3).equals("T")){
                now = now*now*now;
            }
            if(matcher.group(4).equals("*")){
                now *= 2;
                answer = answer + before*2;
            } else if (matcher.group(4).equals("#")) {
                now *= -1;
                answer = answer + before;
            } else{
                answer += before;
            }
            before = now;
        }
        answer += now;
        return answer;
    }
}
