package NumbersProblem;

import java.util.Arrays;
// Max Min of a number
public class maxMin {

    static int[] minMaxDigits(int numb){

        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(numb>0){
            int rem = numb%10;
            min = Math.min(min, rem);
            max = Math.max(max, rem);
            numb/=10;
        }
      

        return new int []{min, max};
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMaxDigits(433598425)));
    }
}
