package NumbersProblem;

// Factors of a given number
public class factorsNumber {
    public static void main(String[] args) {
        int n=6;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i+" ");
                if (i != n / i) { // this will take care of remaining part so no need to traverse till n so time complexity will be sqrt(n) 
                    System.out.print(n/i+" ");
                }
            }
        }
        System.out.println();
    }
}

// Time Complexity -- Math.sqrt(n)