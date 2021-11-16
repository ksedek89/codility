package sort;

import java.util.Arrays;

public class BuildInSort {
    public static void main(String[] arg){
        // TODO: 08.09.21  
        //O( length + maxElement)
        int[] tableToSort = {0,2,5,5,2,6,0,1,8,4,2,4};
        Arrays.sort(tableToSort);
        for(int i: tableToSort){
            System.out.print(i);
        }
        System.out.println();

    }



}
