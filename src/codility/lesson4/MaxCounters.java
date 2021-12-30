package codility.lesson4;

public class MaxCounters {

    public static void main(String[] args) {
        MaxCounters solution = new MaxCounters();
        int[] a = {3,4,4,6,1,4,4};
        int[] solution1 = solution.solution(5, a);
        for(int i: solution1){
            System.out.print(i +",");
        }
        System.out.println();
    }

    public int[] solution(int counterNumber, int[] inputArray) {
        int[] counters = new int[counterNumber];
        int maxElement = 0;
        int allElementsMinValue = 0;
        for(int element : inputArray){
            if(element >= 1 && element <= counterNumber){
                if(counters[element-1] < allElementsMinValue){
                    counters[element-1] = allElementsMinValue;
                }
                counters[element-1]++;
                if(counters[element-1] > maxElement){
                    maxElement = counters[element-1];
                }
            }else{
                allElementsMinValue = maxElement;
            }
        }
        for (int l = 0; l<counters.length ; l++){
            if(counters[l] < allElementsMinValue){
                counters[l] = allElementsMinValue;
            }
        }
        return counters;
    }


    public int[] solutionSlow(int counterNumber, int[] inputArray) {
        int[] counters = new int[counterNumber];
        int maxElement = 0;
        for(int element : inputArray){
            if(element >= 1 && element <= counterNumber){
                counters[element-1]++;
                if(counters[element-1] > maxElement){
                    maxElement = counters[element-1];
                }
            }else{
                for (int l = 0; l<counters.length ; l++){
                    counters[l] = maxElement;
                }
            }
        }
        return counters;
    }

}
