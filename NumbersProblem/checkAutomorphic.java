package NumbersProblem;

// Check if a number is Automorphic Number
// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.
public class checkAutomorphic {
    static boolean checkAutomorphicNumb(int numb){
        int sq= numb*numb;
        
        //check reminder from end of both number 
        if(sq%10!=numb%10){
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        System.out.println(checkAutomorphicNumb(76));
    }
}
