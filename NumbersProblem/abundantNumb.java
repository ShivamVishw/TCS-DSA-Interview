package NumbersProblem;

// Check Abundant Number
// Abundant numbers are positive integers for which the sum of their proper divisors (excluding the number itself) is greater than the number.
public class abundantNumb {
    static boolean checkAbundantNumb(int num){
        
        int ans =0;
        for(int i=1; i<num; i++){
            if(num%i==0){
                ans+= i;
            }
        }
        if(ans>num){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkAbundantNumb(54));
    }
}
