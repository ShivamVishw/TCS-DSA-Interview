package NumbersProblem;

// Check if the given number is Harshad(Or Niven) Numb
//  3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.    

public class checkHarshad {
    static boolean checkHarshadNumb(int num){

        int ans =0;
        int temp =num;

        while(num>0){
            int rem = num%10;
            ans= ans+rem;
            num/=10;
        }

        if(temp%ans==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkHarshadNumb(70));
    }
}
