package NumbersProblem;

// Print Fibonacci Series up to Nth term
public class printNFib {
    static void printNFibSeries(int n, int a, int b){
        if(n==1){
            return;
        }
        int c = a+b;
        
        System.out.print(c+" ");
        
        printNFibSeries(n-1, b, c);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printNFibSeries(6, a, b); // at n it will be (n-2) because at 2 places we have already printed
        System.out.println();

    }
}
