package Arrays;

import java.util.Arrays;
public class medianInArr {
    static double medianOfAllElement(int []arr){

        Arrays.sort(arr);
        int n=arr.length;
        double median=0;
        if(n%2!=0){
            //even 
            return (double)arr[n/2];
        }else{
            //odd
            int n1= (n/2)-1;
            int n2= n/2;
            median= (double)(arr[n1]+ arr[n2])/2;
        }
        return median;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,7};
        System.out.println(medianOfAllElement(arr));
    }
}
