package lesson5;

public class MinAvgTwoSlice {

    public static void main(String[] args) {
        MinAvgTwoSlice solution = new MinAvgTwoSlice();
        int[] p = {-3,-5,-8,-4,-10};
        int indexOfSmalestAverage = solution.solution(p);


        System.out.println(indexOfSmalestAverage);
    }

    public int solution(int[] inputArray) {
        int[] prefixSum = new int[inputArray.length+1];
        for(int i=1; i<= inputArray.length; i++){
            prefixSum[i] = prefixSum[i-1] + inputArray[i-1];
        }
        int minimumIndex = 0;
        double minimumAverage = ((double)inputArray[0] + inputArray[1]) / 2;

        int currentIndex = 0;
        double currentAverage;

        for(int i = 2; i<inputArray.length; i++){
            double twoElementAverage = ((double)inputArray[i] + inputArray[i-1]) / 2;
            currentAverage = ((double)prefixSum[i+1] - prefixSum[currentIndex]) / (i+1-currentIndex);
            if(twoElementAverage < currentAverage){
                currentIndex = i-1;
                currentAverage = twoElementAverage;
            }

            if(currentAverage < minimumAverage){
                minimumAverage = currentAverage;
                minimumIndex = currentIndex;
            }
        }
        return minimumIndex;
    }

    // adaptacja algorytmu kadane, wytłumaczenie: https://stackoverflow.com/questions/21635397/min-average-two-slice-codility/46258952
    public int solutionStack( int[] inputArray) {
        int[] prefixSum = new int[inputArray.length+1];
        for(int i = 1; i<= inputArray.length; i++){
            prefixSum[i] =  inputArray[i-1] + prefixSum[i-1];
        }

        int leftIndex = 0, minLeftIndex = 0;
        double avgWithPrev, averageOfTwo, averageHere, minAverage = (inputArray[0] + inputArray[1]) /2;

        for (int i = 2; i < inputArray.length; i++){
            avgWithPrev = ((double) prefixSum[i + 1] - prefixSum[leftIndex]) / (i - leftIndex + 1);
            averageOfTwo = (inputArray[i-1] + inputArray[i]) / 2.0;
            if(averageOfTwo < avgWithPrev){
                averageHere = averageOfTwo;
                leftIndex = i-1;
            }else{
                averageHere = avgWithPrev;
            }

            if(averageHere < minAverage){
                minAverage = averageHere;
                minLeftIndex = leftIndex;
            }
        }
        return minLeftIndex;
    }


}

