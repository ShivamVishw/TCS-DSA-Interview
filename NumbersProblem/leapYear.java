package NumbersProblem;

public class leapYear {
    //  A year is a leap year only if it satisfies the following condition.
    //  The year is divisible by 400    
    //  The year is divisible by 4 but not by 100
    
    public static void main(String args[]) {
        int year = 1992;
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
      }
}
