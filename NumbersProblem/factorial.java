package NumbersProblem;

// Factors of a Given Number
public class factorial {
    static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int factnm1 = printFactorial(n-1);
        int factn = n*factnm1;
        return factn;
    }
    public static void main(String[] args) {
        System.out.println(printFactorial(5));

    }
}
