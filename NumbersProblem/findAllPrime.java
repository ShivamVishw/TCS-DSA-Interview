package NumbersProblem;

// Prime Numbers in a given range

public class findAllPrime {
    static boolean checkAllPrimeNumb(int numb){

        int count=0;
        //base case
        if(numb==1 || numb<=0){
            return false;
        }

        //check 
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

    static void printPrime(int min, int max){
        for(int i=min; i<=max; i++){
            if(checkAllPrimeNumb(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPrime(10, 16);    
    }
}
