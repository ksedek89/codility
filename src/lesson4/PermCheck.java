package lesson4;

public class PermCheck {

    public static void main(String[] args) {
        PermCheck solution = new PermCheck();
        int[] a = {1};
        System.out.println(solution.solution( a));
    }

    public int solution(int[] inputArray) {
        int[] tempArray = new int[inputArray.length];
        for(int element = 0; element < inputArray.length; element++){
            int curValue = inputArray[element];
            if(curValue <= tempArray.length){
                tempArray[curValue-1] = 1;
            }
        }
        for(int element: tempArray){
            if(element == 0){
                return 0;
            }
        }
        return 1;
    }


}
