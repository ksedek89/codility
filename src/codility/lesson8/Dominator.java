package codility.lesson8;



public class Dominator {

    public static void main(String[] args) {
        Dominator solution = new Dominator();
        int[] a = {};
        System.out.println(solution.solution(a));
    }

    public int solution(int[] inputArray) {
        if(inputArray.length == 0){
            return -1;
        }
        int[] tempArray = new int[inputArray.length];
        for(int i=0;i< inputArray.length; i++){
            tempArray[i] = inputArray[i];
        }
        java.util.Arrays.sort(inputArray);
        int element = inputArray[inputArray.length / 2];
        int counter= 0;

        int index = -1;
        for(int i=0;i< tempArray.length; i++){
            if(tempArray[i] == element){
                counter++;
                index = i;
            }
        }
        return counter > inputArray.length /2 ?  index: -1;
    }
}
