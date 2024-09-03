package NumbersProblem;

// Print all Prime Factors of the given number
public class primeFactors {
    public static void main(String[] args) {
        int n=35;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                if(checkPrimeNumb(i)){
                    System.out.print(i+" ");

                    if (i != n / i) { // for remaining parts
                        if(checkPrimeNumb(n/i)){
                            System.out.print(n/i+" ");
                        }
                    }
                }
            }
        }
        System.out.println();
    }

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
}
