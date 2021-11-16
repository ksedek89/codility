package lesson3;

import java.util.Arrays;

public class PermMissingElem {

    public static void main(String[] args) {
        PermMissingElem solution = new PermMissingElem();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        int[] a = new int[1000000];
        long l = System.nanoTime();
        int solution1 = solution.solution(a);
        long l1 = System.nanoTime();
        int solution2 = solution.solutionMy(a);
        long l2 = System.nanoTime();
        System.out.println(solution1  + ":"+ (l1-l) + " n");
        System.out.println(solution2  + ":"+ (l2-l1) + " n");

    }

    public int solutionSortFirst(int[] a) {
        if(a.length == 0){
            return 1;
        }
        Arrays.sort(a);
        int counter = 1;
        for(int curEl: a){
            if(curEl!= counter++){
                return counter-1;
            }
        }
        return counter;
    }


    public int solution(int[] a) {
        int sum = 0;
        int sumReal = 0;
        for(int i=1; i <= a.length+1; i++){
            sum = sum + i;
        }

        for(int el : a){
            sumReal+= el;
        }

        return sum - sumReal;
    }
    //trzeba uważać na przepełnienia intów
    public int solutionMy(int[] a) {
        int sumReal = 0;

        long length = a.length+1;
        long sum = length*(length+1)/2;

        for(int el : a){
            sumReal+= el;
        }
        return (int)(sum - sumReal);
    }


}
