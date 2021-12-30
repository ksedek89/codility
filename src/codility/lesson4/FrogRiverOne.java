package codility.lesson4;

public class FrogRiverOne {

    public static void main(String[] args) {
        FrogRiverOne solution = new FrogRiverOne();
        int[] a = {1,3,1,4,2,3,5,4};

        System.out.println(solution.solution(5, a));
    }

    public int solution(int position, int[] leaves){
        int[] tempArray = new int[position];
        int counter = 0;
        for(int i=0; i< leaves.length ; i++){
            int leaf = leaves[i];
            if(leaf <= position && tempArray[leaf-1]  == 0){
                tempArray[leaf-1] = 1;
                counter++;
            }
            if(counter == position){
                return i;
            }
        }
        return -1;
    }



}
