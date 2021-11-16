package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] arg){
        //O( length + maxElement)
        int[] tableToSort = {0,2,5,5,2,6,0,1,8,4,2,4};
        CountSort countSort = new CountSort();
        int[] resultArray = countSort.countSort(tableToSort, 8);
        for(int i: resultArray){
            System.out.print(i);
        }
        System.out.println();

    }

    public int[] countSort(int[] inputArray, int maxElement) {
        int[] countArray = new int[maxElement+1];
        int[] resultArray = new int[inputArray.length];
        for(int i: inputArray){
            countArray[i]++;
        }
        for(int i=1;i<countArray.length;i++){
            countArray[i] = countArray[i-1] + countArray[i];
        }

        for(int i = inputArray.length-1; i>=0; i--){
            int currentElement = inputArray[i];
            int ammountFoCurrentElement = countArray[currentElement];
            resultArray[ammountFoCurrentElement-1] = currentElement;
            countArray[currentElement] = countArray[currentElement]-1;
        }

        return resultArray;
    }


}
