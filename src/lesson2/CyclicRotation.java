package lesson2;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] array = {2,3,4,5,6};
        new CyclicRotation().solution(array, 3);

    }


    private int[] solution(int[] a, int k){
        if(a.length == 0){
            return a;
        }
        for (int i = 1; i <=k ; i++){
            a = shiftRight(a);
        }
        return a;
    }

    private int[] shiftRight(int[] a) {
        int[] tempArray =new int[a.length];
        tempArray[0] = a[a.length-1];
        for(int i = 0; i<a.length-1; i++){
            tempArray[i+1] = a[i];
        }
        for(int i = 0; i<tempArray.length ;i++ ){
            System.out.print(tempArray[i] + ",");
        }
        System.out.println();
        return tempArray;
    }

}
