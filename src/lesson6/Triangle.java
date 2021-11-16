package lesson6;



public class Triangle {

    public static void main(String[] args) {
        Triangle solution = new Triangle();
        int[] a = new int[] {10,2,5,1,8,20};
        System.out.println(solution.solution(a));
    }
    public int solution(int[] inputArray) {
        java.util.Arrays.sort(inputArray);
        if(inputArray.length < 3){
            return 0;
        }
        for(int i = 2; i< inputArray.length; i++ ){
            if(inputArray[i-2]  > inputArray[i]- inputArray[i-1]){
                return 1;
            }
        }
        return 0;
    }





}
