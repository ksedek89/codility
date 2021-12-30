package codility.lesson6;



public class NumberOfDiscIntersections {

    public static void main(String[] args) {
        NumberOfDiscIntersections solution = new NumberOfDiscIntersections();
        int[] a = new int[] {1,2147483647,0};
        System.out.println(solution.solution(a));
    }
    public int solution(int[] inputArray) {
        int length = inputArray.length;
        long[] leftArray = new long[length];
        long[] rightArray = new long[length];

        for(int i = 0; i<length;i++){
            leftArray[i] = i - inputArray[i];
            rightArray[i] = (long)inputArray[i] + i;
        }
        java.util.Arrays.sort(leftArray);
        java.util.Arrays.sort(rightArray);
        int numberOfIntersecions = 0;
        int openDiscs = 0;
        int j = 0;
        for(int i=0;i<length;i++){
            while(j < length && leftArray[j] <= rightArray[i]){
                openDiscs++;
                numberOfIntersecions += openDiscs -1;
                j++;
            }
            openDiscs--;
        }

        if(numberOfIntersecions > 10000000){
            numberOfIntersecions = -1;
        }
        return  numberOfIntersecions;
    }






}
