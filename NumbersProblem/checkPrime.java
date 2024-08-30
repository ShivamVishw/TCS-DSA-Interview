package NumbersProblem;

// Check if a number is prime or not
public class checkPrime {
    static boolean checkPrimeNumb(int numb){

        int count=0;
        if(numb==1 || numb<=0){
            return false;
        }
        for(int i=2; i<numb; i++){
            if(numb%i==0){
                count++;
            }
        }

        if(count==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeNumb(83));    
    }
}
