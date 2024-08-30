package NumbersProblem;

// Reverse digits of a number
public class reverseDigit {
    static int reverseDigitNumb(int numb){
        
        int rev=0;
        while(numb>0){
            int rem = numb%10;
            rev = rev*10 + rem;
            numb/=10;
        }

        return rev;
    }
    public static void main(String[] args) {
        System.out.println(reverseDigitNumb(456547));
    }
}
