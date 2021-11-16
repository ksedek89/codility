package lesson3;

public class FrogSolution {

    public static void main(String[] args) {
        FrogSolution solution = new FrogSolution();
        int solution1 = solution.solution(10, 85, 30);
        System.out.println(solution1);


    }



    public int solution(int x, int y, int d) {
        if((y-x) % d == 0){
            return (y-x) / d;
        }
        return (y-x) / d+1;
    }




}
