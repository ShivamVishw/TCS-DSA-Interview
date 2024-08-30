package NumbersProblem;

// Check whether a number is Perfect Number or not
public class checkPerfect {
    static boolean checkPerfectNumb(int num){
    	int ans = 0;
    	
    	// Calculate 
    	for(int i=1; i<num; i++){
            if(num%i==0){
                ans+=i;
            }
        }

    	// Compare with the original value
    	if(ans== num){
			return true;
		}

        return false;
    }

    public static void main(String[] args) {
        boolean result= checkPerfectNumb(6);
        System.out.println(result);
    }
}
