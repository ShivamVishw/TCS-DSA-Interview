package Arrays;

/**
 * smallest
 */

// Find the smallest number in an array

public class smallest {

    static int smallestNumb(int []arr){
        int ans= Integer.MAX_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {23,53,5,5,75,4,2,34,467};
        System.out.println(smallestNumb(arr));
    }
}