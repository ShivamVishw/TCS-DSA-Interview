package Arrays;

public class avgAllElement {
    static double avgOfAllElement(int []arr){
        int n=arr.length;
        double sum=0;
        for(int i=0; i<n; i++){
            sum+=(double)arr[i];
        }
        return sum/n;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(avgOfAllElement(arr));
    }
}
