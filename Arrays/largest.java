package Arrays;

// Find the largest number in an array
public class largest {
    static int largestNumb(int []arr){
        int ans= Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {23,53,5,5,75,4,2,34,467};
        System.out.println(largestNumb(arr));
    }
}
