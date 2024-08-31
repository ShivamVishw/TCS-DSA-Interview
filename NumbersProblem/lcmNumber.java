package NumbersProblem;

// Find LCM of two numbers
public class lcmNumber {
    static int gcdOfTwoNumber(int num1, int num2){
 
        for(int i=Math.min(num1, num2); i>1; i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        
        return 1;
    }   

    static int lcmOfNumber(int n1, int n2){
        if(gcdOfTwoNumber(n1, n2)!= -1){
            return (n1*n2)/gcdOfTwoNumber(n1, n2);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(lcmOfNumber(11, 13));
    }
}
