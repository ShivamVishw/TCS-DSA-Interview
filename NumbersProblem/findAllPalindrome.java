package NumbersProblem;

// Find all Palindrome numbers in a given range
public class findAllPalindrome {
    static void findAllPalindromeNumb(int numb, int min, int max){

        int rev =0;
        int temp = numb;

        if(Integer.toString(numb).length()==1){
            System.out.print(temp+" ");
            return;
        }
       
        while(numb>0){
            int rem = numb%10;
            rev = rev*10 + rem; 
            numb/=10;
        }

        if(rev==temp){
            System.out.print(temp+" ");
        }
    }

    static void callPalindrome(int min, int max){
        for(int i=min; i<=max; i++){

            findAllPalindromeNumb(i, min, max);
            
        }
        System.out.println();
    }


    public static void main(String[] args) {
        callPalindrome( 100, 150);
    }
}
