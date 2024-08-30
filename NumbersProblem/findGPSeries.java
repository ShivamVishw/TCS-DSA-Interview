package NumbersProblem;

// Program to find Sum of GP Series
public class findGPSeries {
    public static void main(String[] args) {
        // Example values
        int firstTerm = 3;
        int commonDifference = 5;
        int numberOfTerms = 2;
        
        float ans = firstTerm * ((float) Math.pow(commonDifference, numberOfTerms) - 1) / (commonDifference - 1);
        
        // Print the result
        System.out.println("Sum of Gp series: " + ans);
    }
}
