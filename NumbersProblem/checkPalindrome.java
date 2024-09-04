package NumbersProblem;

// que- Check if a number is Palindrome or Not 
public class checkPalindrome {
    
    static boolean checkPalindromeNumb(int numb){

        int rev =0;
        int temp = numb;
        while(numb>0){
            int rem = numb%10;
            rev = rev*10 + rem; 
            numb/=10;
        }

        if(rev==temp){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindromeNumb(4334));
    }
}
