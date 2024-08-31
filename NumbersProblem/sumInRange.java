package NumbersProblem;

// Find the sum of numbers in the given range
public class sumInRange {
    static int sumOfNumbInRange(int low, int high){
        int ans =0;
        for(int i=low; i<=high; i++){
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sumOfNumbInRange(2, 7));
    }
}
