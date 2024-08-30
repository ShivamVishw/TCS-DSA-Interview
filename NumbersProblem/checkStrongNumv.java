package NumbersProblem;

// Check if a number is a Strong Number or not
public class checkStrongNumv {
    static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int factnm1 = printFactorial(n-1);
        int factn = n*factnm1;
        return factn;
    }

    static boolean checkStrongNumb(int n){
        int temp = n;
        int ans =0;
        while(n>0){
            int rem = n%10;
            ans+= printFactorial(rem);
            n/=10;
        }

        if(ans== temp){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkStrongNumb(26));
    }
}
