package codility.lesson7;


public class Brackets {

    public static void main(String[] args) {
        Brackets solution = new Brackets();
        String a = "{[()()]}";
        System.out.println(solution.solution(a));



    }

    public int solution(String inputString) {
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
        return currentChar == '}'  || currentChar == ']'  || currentChar == ')';
    }
    private boolean isOpeningBracket(char currentChar){
        return currentChar == '{'  || currentChar == '['  || currentChar == '(';
    }

    private boolean opppositeBracket(char openChar, char closeChar){
        return
                        (openChar == '{' && closeChar == '}') ||
                        (openChar == '(' && closeChar == ')') ||
                        (openChar == '[' && closeChar == ']') ;
    }
}
