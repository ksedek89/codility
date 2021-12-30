package codility.lesson5;

public class DzielnikiSolution {

    public static void main(String[] args) {
        DzielnikiSolution solution = new DzielnikiSolution();
        long l = System.nanoTime();
        solution.solution(8, 898988998 ,2);
        System.out.println("First: " + (System.nanoTime() - l )/1000 + " micro");
        l = System.nanoTime();
        solution.solutionOpt(8, 898988998 ,2);
        System.out.println("Optimized: " + (System.nanoTime() - l )/1000 + " micro");

    }

    private int solution(int a, int b, int c){
        int counter = 0;
        for(int i = a; a<= b; a++){
            if(a%b == 0){
                counter ++;
            }
        }
        return counter;
    }

    private int solutionOpt(int a, int b, int k){
        return a%k == 0 ? (b-a) / k + 1 : (b - (a-a%k)) /k;

    }


}
