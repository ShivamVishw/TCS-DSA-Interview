package NumbersProblem;

// Permutations in which N people can occupy R seats

// basically find the value of n!/(n-r)!
public class permutationNR {
    
    static int permutationOfNPeopleOccupyRSeats(int n, int r){
        int raw1= printFactorial(n);
        int raw2= printFactorial(n-r);

        return raw1/raw2;
    }

    static int printFactorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        
        int factnm1 = printFactorial(n-1);
        int factn = n*factnm1;
        return factn;
    }
    public static void main(String[] args) {
        System.out.println(permutationOfNPeopleOccupyRSeats(6, 4));
    }
}
