package NumbersProblem;

public class checkEvenOdd {
    
    static void checkEvenOrOdd(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        checkEvenOrOdd(6);
    }
}
