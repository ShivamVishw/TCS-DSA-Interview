package NumbersProblem;

// Sum Of Digits of A Number
public class sumOfDigit {
    public static void main(String[] args) {
        int numb = 102;
        int ans =0;
        while(numb>0){
            ans += numb%10;
            numb/=10;
        }

        System.out.println(ans);
    }
}
