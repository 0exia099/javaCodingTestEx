package ch4;

public class ArrayEx3 {
    // 두 배열이 정렬 되어 있을때 두 배열 값의 중앙값
    public static double solution(int[] x, int[] y) {

        int maxLen = x.length + y.length;
        boolean isDouble = (maxLen) % 2 == 0 ? true : false;
        int center = maxLen/2;
        int xc = x.length/2;
        int yc = center - xc;
        if(!isDouble)
            yc += 1;
        if(x[0] > y[y.length-1] && center < y.length){
            if(isDouble){
                return (y[center-1] + y[center] + 0.0)/2;
            }else{
                return y[center];
            }
        }else if(x[x.length -1] < y[0] && center <= x.length){
            if(isDouble){
                return (x[center-1] + x[center] + 0.0)/2;
            }else{
                return x[center];
            }
        }
        while(x[xc-1] > y[yc] || x[xc] < y[yc - 1]){
            if(x[xc-1] > y[yc]) {
                xc -= 1;
                yc += 1;
            }else{
                yc -= 1;
                xc += 1;
            }
        }
        int big = x[xc-1] > y[yc-1] ? x[xc-1] : y[yc-1];
        if(isDouble){
            int more = x[xc] > y[yc] ? y[yc] : x[xc];
            return big + more / 2;
        }else{
            return big;
        }
    }
}
