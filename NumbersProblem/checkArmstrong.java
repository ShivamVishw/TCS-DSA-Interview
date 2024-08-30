package NumbersProblem;

// Check if a number is armstrong number of not
public class checkArmstrong {
    static boolean checkArmstrongNumb(int num){
        int temp = num;
    	int ans = 0;
    	int digits = 0;

    	// Calculate the number of digits in num
   	 	String n2 = Integer.toString(num);
		digits = n2.length();

    	// Calculate the sum of the digits raised to the power of the number of digits
    	while (temp > 0) {
        	int rem = temp % 10;
        	ans += Math.pow(rem, digits);
        	temp /= 10;
    	}

    	// Compare with the original value
    	if(ans== num){
			return true;
		}

        return false;
    }

    public static void main(String[] args) {
        boolean result= checkArmstrongNumb(152);
        System.out.println(result);
    }
}
