package lesson9;

public class MaxProfit {

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();
        int[] p = {23171, 21011, 21123,21366, 21013, 21367};
        int indexOfSmalestAverage = solution.solution(p);


        System.out.println(indexOfSmalestAverage);
    }

    public int solution(int[] inputArray) {
        if(inputArray.length == 1 || inputArray.length == 0){
            return 0;
        }
        int maxDifference = 0;
        int minElement = inputArray[0];
        for(int i = 1; i < inputArray.length; i++){
            int currentElement = inputArray[i];
            minElement = Math.min(minElement, currentElement);
            maxDifference = Math.max(currentElement-minElement, maxDifference);
        }

        return maxDifference;
    }


}

