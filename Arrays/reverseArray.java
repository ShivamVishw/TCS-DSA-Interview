package Arrays;

// Reverse a given array
import java.util.Arrays;
public class reverseArray {
    static int[] reverseArr(int []arr){
        int n= arr.length;
        for(int i=0; i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]= temp;
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {23,53,5,5,75,4,2,34,467};
        System.out.println(Arrays.toString(reverseArr(arr)));
    }
}
