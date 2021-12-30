package codility.lesson5;

public class GenomicRangeQuery {

    public static void main(String[] args) {
        GenomicRangeQuery solution = new GenomicRangeQuery();
        int[] p = {2,5,0};
        int[] q = {4,5,6};
        int[] cagcctas = solution.solution("CAGCCTA", p, q);

        for(int i: cagcctas){
            System.out.print(i +",");
        }
        System.out.println();
    }

    //prefix sum
    //short and efficient
    public int[] solution(String s, int[] p, int[] q) {
        char[] letters = s.toCharArray();
        int[][] prefixSumMatrix = new int[4][letters.length +1];
        int[] counters = new int[4];

        for(int i = 1; i <= letters.length; i++){
            // first counter = 1 index
            int nucleotides = NUCLEOTIDES.valueOf(String.valueOf(letters[i-1])).getNucleotides();
            counters[nucleotides-1] ++;
            for(int j = 0; j< prefixSumMatrix.length;j++){
                prefixSumMatrix[j][i] = counters[j];
            }
        }
        int[] minimalImpactFactorArray = new int[p.length];
        for(int i = 1; i<= p.length; i++){
            int pElement = p[i-1];
            int qElement = q[i-1];
            int minElement = -1;

            for(int j = 0; j< prefixSumMatrix.length;j++){
                if(prefixSumMatrix[j][qElement+1] - prefixSumMatrix[j] [pElement] > 0){
                    minElement = j+1;
                    break;
                }
            }
            minimalImpactFactorArray[i-1] = minElement;
        }
        return minimalImpactFactorArray;
    }


   //prefix sum
    public int[] solutionOpt(String s, int[] p, int[] q) {
        char[] letters = s.toCharArray();
        int[] aPrefixSum = new int[letters.length+1];
        int[] cPrefixSum = new int[letters.length+1];
        int[] gPrefixSum = new int[letters.length+1];
        int[] tPrefixSum = new int[letters.length+1];
        int aCounter = 0, cCounter = 0, gCounter = 0, tCounter = 0;

        for(int i = 1; i <= letters.length; i++){
            // first counter = 1 index
            char letter = letters[i-1];
            if(letter == 'A'){
                aCounter++;
            }
            if(letter == 'C'){
                cCounter++;
            }
            if(letter == 'G'){
                gCounter++;
            }
            if(letter == 'T'){
                tCounter++;
            }
            aPrefixSum[i] = aCounter;
            cPrefixSum[i] = cCounter;
            gPrefixSum[i] = gCounter;
            tPrefixSum[i] = tCounter;
        }

        int[] minimalImpactFactorArray = new int[p.length];
        for(int i = 1; i<= p.length; i++){
            int pElement = p[i-1];
            int qElement = q[i-1];
            int minElement = -1;
            if(aPrefixSum[qElement+1] - aPrefixSum [pElement] > 0){
                minElement = 1;
            }else if(cPrefixSum[qElement+1] - cPrefixSum [pElement] > 0){
                minElement = 2;
            }else if(gPrefixSum[qElement+1] - gPrefixSum [pElement] > 0){
                minElement = 3;
            }else if(tPrefixSum[qElement+1] - tPrefixSum [pElement] > 0){
                minElement = 4;
            }
            minimalImpactFactorArray[i-1] = minElement;
        }

        return minimalImpactFactorArray;

    }

    enum NUCLEOTIDES{
        A(1),
        C(2),
        G(3),
        T(4);
        int nucleotides;

        public int getNucleotides() {
            return nucleotides;
        }

        NUCLEOTIDES(int nucleotides) {
            this.nucleotides = nucleotides;
        }
    }



    public int[] solutionSlow(String s, int[] p, int[] q) {
        int[] returnArray = new int[p.length];
        for(int i = 0; i< p.length; i++){
            int pElement = p[i];
            int qElement = q[i];
            int minElement = Integer.MAX_VALUE;
            for(int j = pElement; j<= qElement; j++){
                String s1 = String.valueOf(s.charAt(j));
                int nucleotides1 = NUCLEOTIDES.valueOf(s1).getNucleotides();
                if(nucleotides1 < minElement){
                    minElement = nucleotides1;
                }
            }
            returnArray[i] = minElement;
        }
        return returnArray;
    }


}

