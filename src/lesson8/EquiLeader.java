package lesson8;

public class EquiLeader {

    public static void main(String[] args) {
        EquiLeader solution = new EquiLeader();
        int[] a = {4,3,4,4,4,2};
        System.out.println(solution.solution(a));
    }

    public int solution(int[] inputArray) {
        int length = inputArray.length;
        int[] notSortedArray = new int [length];
        for(int i=0; i<length;i++){
            notSortedArray[i] = inputArray[i];
        }

        java.util.Arrays.sort(inputArray);
        int leader = inputArray[length / 2];
        int allLeaderCount = 0;
        for(int i = 0; i<length;i++){
            if(inputArray[i] == leader){
                allLeaderCount++;
            }
        }
        int currentLeaderCount = 0;
        int currentNonLeaderCount = 0;
        int numberOfEquiLeaders = 0;
        for(int i = 0; i<length;i++) {
            if(notSortedArray[i] == leader){
                currentLeaderCount++;
            }else{
                currentNonLeaderCount++;
            }
            if(currentLeaderCount > currentNonLeaderCount && (allLeaderCount-currentLeaderCount > length-allLeaderCount-currentNonLeaderCount)){
                numberOfEquiLeaders++;
            }
        }
        return numberOfEquiLeaders;
    }
}
