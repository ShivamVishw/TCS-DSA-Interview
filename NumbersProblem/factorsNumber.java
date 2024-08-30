package NumbersProblem;

// Factors of a given number
public class factorsNumber {
    public static void main(String[] args) {
        int n=6;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
                if (i != n / i) { // If divisors are not the same, add the pair
                    System.out.print(n/i+" ");
                }
            }
        }
        System.out.println();
    }
}
