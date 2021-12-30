package codility.lesson5;

import java.util.Arrays;

import static java.util.Arrays.stream;

public class PassingCars {

    public static void main(String[] args) {
        PassingCars solution = new PassingCars();
        int[] a = {0,1,0,1,1};

        System.out.println(solution.solution(a));
    }

    public int solution(int[] allCars) {
        int westCarCounter = 0;
        for(int car: allCars){
            if(car == 1){
                westCarCounter++;
            }
        }
        int sum = 0;
        for(int car: allCars){
            //east
            if(car == 0){
                sum += westCarCounter;
                if(sum > 1000000000){
                    return -1;
                }
            }else{
                westCarCounter--;

            }
        }
        return sum;
    }


}
