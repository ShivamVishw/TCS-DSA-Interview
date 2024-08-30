package Arrays;

// Calculate sum of the elements of the array
public class sumOfElement {
    static int sumOfElementArr(int []arr){
        
        int n=arr.length;
        int i=0;
        int ans = 0;
        while(i<n){
            ans+=arr[i];
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfElementArr(arr));
    }
}
