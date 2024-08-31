package NumbersProblem;

// Find GCD of two numbers
public class gcdNumber {
    static int gcdOfTwoNumber(int num1, int num2){
 
        for(int i=Math.min(num1, num2); i>1; i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(gcdOfTwoNumber(20, 15));
    }
}
