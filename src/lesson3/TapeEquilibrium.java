package lesson3;

import java.util.Arrays;

public class TapeEquilibrium {

    public static void main(String[] args) {
        TapeEquilibrium solution = new TapeEquilibrium();
        int[] a = {-1000,1000};
        int solution1 = solution.solution(a);
        System.out.println(solution1);


    }
    public int solution(int[] a) {
        int min = Integer.MAX_VALUE;
        int sumBefore = 0;
        int sumAfter = 0;
        for(int i = 0;i < a.length; i++){
            sumAfter += a[i];

        }
        for(int i = 0; i<a.length-1; i++){
            int currentValue = a[i];
            sumBefore += currentValue;
            sumAfter -= currentValue;

            int abs = Math.abs(sumBefore - sumAfter);
            if(abs< min) {
                min = abs;
            }
        }
        return min;
    }

    public int solutionSlow(int[] a) {
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<a.length-1; i++){
            int sumBefore = 0;
            int sumAfter = 0;;

            for(int counter = 0; counter <= i; counter++){
                sumBefore += a[counter];
            }
            for(int counter = i+1; counter < a.length; counter++){
                sumAfter += a[counter];
            }

            int abs = Math.abs(sumBefore - sumAfter);
            if(abs< max) {
                max = abs;
            }
        }
        return max;
    }
}
