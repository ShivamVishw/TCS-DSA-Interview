package NumbersProblem;

// Check Abundant Number
// Abundant numbers are positive integers for which the sum of their proper divisors (excluding the number itself) is greater than the number.
public class abundantNumb {
    static boolean checkAbundantNumb(int num){
        // Edge case: Abundant numbers are only positive integers greater than 1
        if (num <= 1) {
            return false;
        }

        int ans =1; // 1 is always a proper divisor of any number > 1
        for(int i=2; i<=Math.sqrt(ans); i++){
            if(num%i==0){
                ans+= i;
                if(i!= num/i){
                    ans+=num/i;
                }
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
