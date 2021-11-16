package sort;

public class QuickSort {
    public static void main(String[] arg){
        //O( length + maxElement)
        int[] tableToSort = {0,2,5,5,2,6,0,1,8,4,2,4};
        QuickSort qucikSort = new QuickSort();
        int[] resultArray = qucikSort.quickSort(tableToSort);
        for(int i: resultArray){
            System.out.print(i);
        }
        System.out.println();

    }

    public int[] quickSort(int[] inputArray) {
        return  null;
    }


}
