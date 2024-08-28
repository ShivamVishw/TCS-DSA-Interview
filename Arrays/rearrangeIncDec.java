package Arrays;

import java.util.Arrays;

public class rearrangeIncDec {
    static int[] rearrangeIncDecOrder(int []arr){
        int n= arr.length;
        Arrays.sort(arr);
        //Now sorted
       
        //for 2nd part and first is alredy done 
        int mid= arr.length/2;
        for(int i=mid; i<(mid+ (n-mid)/2); i++){
            int temp = arr[i];
            arr[i]= arr[n-(i-mid)-1];
            arr[n-(i-mid)-1]= temp;
        }
        
        return arr;
    }
    public static void main(String[] args) {
        // int arr[] = {23,53,5,5,75,4,2,34,467};
        int[] arr= {8, 7, 1, 6, 5, 9};
        System.out.println(Arrays.toString(rearrangeIncDecOrder(arr)));
    }
}
