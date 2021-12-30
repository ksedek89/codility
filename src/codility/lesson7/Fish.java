package codility.lesson7;


import java.util.Deque;
import java.util.Stack;

public class Fish {

    public static void main(String[] args) {
        Fish solution = new Fish();
        int[] a = {4,3,2,1,5};
        int[] b = {0,1,0,0,0};
        System.out.println(solution.solution(a, b));


    }

    public int solution(int[] fishSizeArray, int[] fishDirectionArray) {
        java.util.Stack<Integer> stack = new java.util.Stack();
        int numberOfSurvivedFish = fishSizeArray.length;
        for(int i =0 ;i < fishSizeArray.length ; i++){
            int currentFishSize = fishSizeArray[i];
            int currentDirectionArray = fishDirectionArray[i];
            if(currentDirectionArray == 0 && stack.size() == 0){
                continue;
            }else if(currentDirectionArray == 1){
                stack.push(currentFishSize);
            }else if(currentDirectionArray == 0 && stack.size() > 0){
                while(stack.size() != 0){
                    Integer stackCurrentFishSize = stack.pop();
                    numberOfSurvivedFish--;
                    if(currentFishSize < stackCurrentFishSize){
                        stack.push(stackCurrentFishSize);
                        break;
                    }
                }
            }
        }
        return numberOfSurvivedFish;
    }


}
