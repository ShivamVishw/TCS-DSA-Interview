package NumbersProblem;

public class sumOfTwoPrime {
    static boolean checkPrimeNumb(int numb){

        int count=0;
        if(numb==1 || numb<=0){
            return false;
        }
        if(numb==2){
            return true;
        }
        if (numb % 2 == 0) { 
            return false; // Any other even number is not prime
        }
        for(int i=2; i<=Math.sqrt(numb); i++){
            if(numb%i==0){
                count++;
                if(i!= numb/i){
                    count++;
                }
            }
        }

        if(count==0){
            return true;
        }

        return false;
    }

    static boolean checkSumOfTwoPrime(int n){
        
        for (int left = 2; left <= n / 2; left++) {  //start from 2 becoz prime num starts from 2 only
            //get right updated  
            int right = n - left;   
            if (checkPrimeNumb(left) && checkPrimeNumb(right)) {
                System.out.println(left + " " + right);
                return true;   
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkSumOfTwoPrime(28));
    }
}
