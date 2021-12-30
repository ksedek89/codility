package codility.lesson4;

import java.util.Arrays;

public class CountingElements {

    public static void main(String[] args) {
        CountingElements solution = new CountingElements();
        int[] a = {};
        int solution1 = solution.solution( a);
        System.out.println(solution1);
    }
    //second array
    public int solution(int[] inputArray) {
        int maxElement = 0;
        for(int element: inputArray){
            if(element > maxElement){
                maxElement = element;
            }
        }
        int[] tempArray = new int[maxElement];
        for(int element: inputArray){
            if(element > 0){
                tempArray[element-1] = 1;
            }
        }

        for(int i = 0; i<tempArray.length; i++){
            if (tempArray[i] == 0){
                return i+1;
            }
        }
        return maxElement+1;
    }


}
