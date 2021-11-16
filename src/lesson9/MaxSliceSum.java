package lesson9;

public class MaxSliceSum {

    public static void main(String[] args) {
        MaxSliceSum solution = new MaxSliceSum();
        int[] p = {3,2,-6,4,0};
        int indexOfSmalestAverage = solution.solution(p);


        System.out.println(indexOfSmalestAverage);
    }
    //kadane algorithm
    public int solution(int[] inputArray) {
        if(inputArray.length == 1){
            return inputArray[0];
        }
        int currentSum= inputArray[0];
        int maxSum = currentSum;
        for(int i=1; i<inputArray.length;i++){
            int currentElement = inputArray[i];
            currentSum = Math.max(currentElement, currentElement + currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }


}

