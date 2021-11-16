package lesson6;


public class MaxProductOfThree {

    public static void main(String[] args) {
        MaxProductOfThree solution = new MaxProductOfThree();
        int[] a = new int[] {-5, -6, -4, -7, -10};
        System.out.println(solution.solution(a));
    }
    public int solution(int[] inputArray) {
        java.util.Arrays.sort(inputArray);
        int length = inputArray.length;
        int maxTriplet = Math.max(inputArray[length-1] * inputArray[0] * inputArray[1]  , inputArray[length-1] * inputArray[length-2]*inputArray[length-3]);
        return maxTriplet;
    }

    public int solutionLong(int[] inputArray) {
        int length = inputArray.length;
        java.util.Arrays.sort(inputArray);
        int[] subArray;
        if(inputArray.length <= 6){
            subArray = inputArray;
        }else{
            subArray = new int[6];
            subArray[0] = inputArray[0];
            subArray[1] = inputArray[1];
            subArray[2] = inputArray[2];
            subArray[3] = inputArray[length-1];
            subArray[4] = inputArray[length-2];
            subArray[5] = inputArray[length-3];
        }
        int maxTriplet = Integer.MIN_VALUE;
        for(int i = 0; i<subArray.length; i++){
            for(int j=0; j<subArray.length; j++){
                for( int k= 0; k<subArray.length; k++){
                    if(k != j && k!= i && i!=j){
                        int tempMaxTriplet = subArray[i] * subArray[j] * subArray[k];
                        if(tempMaxTriplet > maxTriplet){
                            maxTriplet = tempMaxTriplet;
                        }
                    }
                }
            }
        }
        return maxTriplet;
    }




}
