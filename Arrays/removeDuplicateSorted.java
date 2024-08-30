package Arrays;

// Remove duplicates from a sorted array
import java.util.Arrays;
public class removeDuplicateSorted {
    static int removeDuplicateFrSorted(int []arr){

        int n=arr.length;
        //its sorted right

        int i=0;
        for(int j=0; j<n; j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }else{
                continue;
            }
        }

        return i+1;   
    }

    static void printFinal(int[] arr){
        int l= removeDuplicateFrSorted(arr);

        for(int i=0; i<l; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3,4};
        printFinal(arr);
    }
}
