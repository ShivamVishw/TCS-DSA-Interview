package NumbersProblem;


// Find Sum of AP Series
public class findAPSeries {
    public static void main(String[] args) {
        // Example values
        int firstTerm = 2;
        int commonDifference = 4;
        int numberOfTerms = 5;

        // Calculate the last term
        int lastTerm = firstTerm + (numberOfTerms - 1) * commonDifference;

        // Calculate the sum using the formula
        int sum = numberOfTerms * (firstTerm + lastTerm) / 2;

        // Print the result
        System.out.println("Sum of AP series: " + sum);
    }
}
