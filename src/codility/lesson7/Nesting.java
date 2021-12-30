package codility.lesson7;


import java.util.Stack;

public class Nesting {

    public static void main(String[] args) {
        Nesting solution = new Nesting();
        String a = "())";
        System.out.println(solution.solution(a));


    }
    public int solution(String inputString) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for(int i= 0;i<inputString.length();i++){
            char currentChar = inputString.charAt(i);
            switch (currentChar){
                case ')':
                    if(stack.isEmpty()){
                        return 0;
                    }
                    stack.pop();
                    break;
                case '(':
                    stack.push(currentChar);
            }
        }
        return stack.size() == 0 ? 1 :0;
    }



    public int solutionLong(String inputString) {
        char[] stack = new char[inputString.length()];
        char[] inputChars = inputString.toCharArray();
        if(inputChars.length == 0){
            return 1;
        }
        int pointer = 0;
        for(int i= 0;i<inputChars.length;i++){
            if(isOpeningBracket(inputChars[i])){
                stack[pointer++] = inputChars[i];
            }else if(isClosingBracket(inputChars[i])){
                if(pointer == 0){
                    return 0;
                }
                if(!opppositeBracket(stack[--pointer], inputChars[i])){
                    return 0;
                }
            }
        }
        return pointer == 0 ? 1 :0;
    }

    private boolean isClosingBracket(char currentChar){
        return currentChar == ')';
    }
    private boolean isOpeningBracket(char currentChar){
        return currentChar == '(';
    }

    private boolean opppositeBracket(char openChar, char closeChar){
        return (openChar == '(' && closeChar == ')');
    }

}
