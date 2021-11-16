package lesson2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RotationArraySolution {

    public static int solution(int[] A) {
        int unpaired = 0;
        for (int number : A) {
            printBinaryFormat(number);
            System.out.println(" number===>"+number);
            //xor jest przemienny
            unpaired = unpaired ^ number;
            printBinaryFormat(unpaired);
            System.out.println(" unpaired===>"+unpaired);
            System.out.println("<=========>");
        }
        return unpaired;
    }

    public static void main(String[] args) {
        int[] A = {5,3,4,3,4};

        int res = solutionSec(A);
//        printBinaryFormat(res);
        System.out.println(" res===>"+res);

    }
    public static void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    public static int solutionSec(int[] A) {
        Arrays.sort(A);
        int count = 0;
        int lastNumber = -1;
        for(int a: A){
            if(a == lastNumber){
                count++;
            }else{
                if(count %2 != 0){
                    return lastNumber;
                }
                lastNumber = a;
                count = 1;
            }
        }
        return lastNumber;
    }


}
