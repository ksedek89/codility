package codility.lesson10;

public class CountFactors {

    public static void main(String[] args) {
        CountFactors solution = new CountFactors();
        int indexOfSmalestAverage = solution.solution(24);


        System.out.println(indexOfSmalestAverage);
    }

    public int solution(int inputNumber) {
        if(inputNumber == 1){
            return 1;
        }

        int counter = 0;
        for(int i =1; i*i<=  inputNumber ; i++){
            if(inputNumber%i == 0){
                counter = counter+2;
            }
        }
        return counter;
    }

}

