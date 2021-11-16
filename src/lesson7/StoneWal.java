package lesson7;


import java.util.Stack;

public class StoneWal {

    public static void main(String[] args) {
        StoneWal solution = new StoneWal();
        int[] a = {8,8,5,7,9,8,7,4,8};
        System.out.println(solution.solution(a));

    }
    public int solution(int[] inputArray) {
        int numberOfBlocks = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for(int i=0 ;i<inputArray.length;i++){
            int currentHeight = inputArray[i];
            if(stack.isEmpty() || currentHeight > stack.peek()){
                stack.push(currentHeight);
                numberOfBlocks++;
            }else{
                while(!stack.isEmpty()){
                    Integer currentValueFromStack = stack.peek();
                    if(currentHeight < currentValueFromStack){
                        stack.pop();
                    }
                    if(currentValueFromStack == currentHeight){
                        break;
                    }
                    if(currentHeight > currentValueFromStack){
                        stack.push(currentHeight);
                        numberOfBlocks++;
                        break;
                    }
                }
                if(stack.isEmpty()) {
                    numberOfBlocks++;
                    stack.push(currentHeight);
                }
            }
        }
        return  numberOfBlocks;
    }

    public int solutionLong(int[] inputArray) {
        int numberOfBlocks = 0;
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        for(int i=0 ;i<inputArray.length;i++){
            int currentHeight = inputArray[i];
            if(stack.isEmpty()){
                stack.push(currentHeight);
                numberOfBlocks++;
                continue;
            }
            Integer lastMaxHeight = stack.peek();
            if(currentHeight == lastMaxHeight){
                continue;
            }else if(currentHeight > lastMaxHeight){
                stack.push(currentHeight);
                numberOfBlocks++;
            }else{
                while(!stack.isEmpty()){
                    Integer currentValueFromStack = stack.peek();
                    if(currentHeight < currentValueFromStack){
                        stack.pop();
                    }
                    if(currentValueFromStack == currentHeight){
                        break;
                    }
                    if(currentHeight > currentValueFromStack){
                        stack.push(currentHeight);
                        numberOfBlocks++;
                    }

                }
                if(stack.isEmpty()) {
                    numberOfBlocks++;
                    stack.push(currentHeight);
                }
            }
        }
        return  numberOfBlocks;
    }
}
