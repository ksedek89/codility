package codility.lesson6;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        Distinct solution = new Distinct();
        int[] a = new int[] {2, 1, 1, 2, 3, 1};
        System.out.println(solution.solution(a));



    }

    public int solution(int[] inputArray) {
        Arrays.sort(inputArray);
        int distinctCount = 0;
        int lastDigit = Integer.MIN_VALUE;
        for(int i = 0; i< inputArray.length; i++){
            if(lastDigit != inputArray[i]){
                distinctCount++;
            }
            lastDigit = inputArray[i];
        }
        return distinctCount;
    }


}
