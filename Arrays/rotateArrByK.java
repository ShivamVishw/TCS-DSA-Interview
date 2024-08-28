package Arrays;
import java.util.Arrays;
public class rotateArrByK {
    static int[] rotateArrByKElement(int[] arr, int k){

        int [] result= new int[arr.length];
        int n= arr.length;

        int j=0;
        for(int i=k; i<n; i++){
            result[j]= arr[i];
            j++;
        }
        for(int i=0; i<k; i++){
            result[j]= arr[i];
            j++;
        }
        return result;  
    }
   
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotateArrByKElement(arr,2)));
    }
}
