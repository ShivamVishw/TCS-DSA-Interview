package NumbersProblem;

// Find LCM of two numbers
public class lcmNumber {
    static int gcdOfTwoNumber(int num1, int num2){
 
        if (num2 == 0) {
           return num1;
        }
        return gcdOfTwoNumber(num2, num1 % num2);
    }   

    static int lcmOfNumber(int n1, int n2){
        if (n1 == 0 || n2 == 0) {
            return 0; // LCM is not defined for zero input
        }
        return (n1 * n2) / gcdOfTwoNumber(n1, n2);
    }

    public static void main(String[] args) {
        System.out.println(lcmOfNumber(11, 13));
    }
}
