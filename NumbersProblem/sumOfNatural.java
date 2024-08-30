package NumbersProblem;

// Sum of first N Natural Number
public class sumOfNatural {
    static int sumOfNaturalNumb(int n){
        
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumb(6));
    }
}
