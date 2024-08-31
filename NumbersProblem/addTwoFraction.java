package NumbersProblem;

// Program to Add two fractions
public class addTwoFraction {
    static void printAddTwoFraction(int num1, int num2, int den1, int den2){
        System.out.println(num1+"/"+ den1+"+"+ num2+"/"+ den2+" = "+ (num1*den2+num2*den1)+ "/"+ den1*den2);
    }

    public static void main(String[] args) {
        printAddTwoFraction(3, 1, 4, 7);
    }
}

