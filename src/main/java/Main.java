import ch1.BitwiseEx1;
import ch1.BitwiseEx2;
import ch1.BitwiseEx3;
import ch2.StringEx1;
import ch3.*;
import ch4.ArrayEx1;
import ch4.ArrayEx3;

public class Main {
    public static void main(String[] args) {
        // BitwiseEx1.solution(17,2);

//        BitwiseEx2.solution(4, 1);
//        BitwiseEx2.solution(4, -1);
//        BitwiseEx2.solution(4, 0);

        // BitwiseEx3.solution(4914, 63, 4, 9);    //5106
//        System.out.println(StringEx1.solution("ab cd e fg"));
//        System.out.println(StringEx1.solution("abc d eb fag"));

//        System.out.println(RegularExpressionEx1.solution("010-1234-abcd"));
//        System.out.println(RegularExpressionEx1.solution("010-1234"));
//        System.out.println(RegularExpressionEx1.solution("01012341234"));
//        System.out.println(RegularExpressionEx1.solution("010-1234-1234"));
//        System.out.println(RegularExpressionEx1.solution("010-1234-123"));

//        System.out.println(RegularExpressionEx2.solution("06/21/2021"));

        //System.out.println(RegularExpressionEx3.solution("10000000000"));

        //System.out.println(RegularExpressionEx4.solution("cv dd 4 k 2321 2 11 k4 k2 66 4d"));

        //System.out.println(RegularExpressionEx5.solution("1S2D*3T"));
//        int[] a = {-5,-2,5,4,3,7,2,1,-1,-2,15,6,12,-4,3};
//        ArrayEx1.solution(a, 10); // (-5,15),(-2,12),(3,7),(4,6)
        int[] x = {1,3,8,9,15};
        int[] y = {7,11,18,19,21,25};
        System.out.println(ArrayEx3.solution(x, y)); // 11

        int[] z = {23,26,31,35};
        int[] z1 = {3,5,7,9,11,16};
        System.out.println(ArrayEx3.solution(z, z1)); // 13.5
    }
}