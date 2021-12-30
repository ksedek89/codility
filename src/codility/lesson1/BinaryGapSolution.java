package codility.lesson1;

public class BinaryGapSolution {

    public static void main(String[] args) {
        BinaryGapSolution solution = new BinaryGapSolution();
        long l = System.nanoTime();
        solution.solution(561892);
        System.out.println("First: " + (System.nanoTime() - l )/1000 + " micro");


    }

    private int solution(long N){
        String s = Long.toBinaryString(N);
        int maxCount = 0;
        int currentCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("0")){
                currentCount++;
            }else{
                if(currentCount > maxCount){
                    maxCount = currentCount;
                }
                currentCount = 0;
            }
        }
        System.out.println(s);
        System.out.println(maxCount);
        return maxCount;
    }


}
