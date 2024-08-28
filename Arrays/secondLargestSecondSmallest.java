package Arrays;

public class secondLargestSecondSmallest {
    static int secondSmallestNumb(int []arr){
        int ans= Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]= temp;
            }
        }

        int secLargest= arr[1];

        return secLargest;
    }

    static int secondLargestNumb(int []arr){
        int ans= Integer.MIN_VALUE;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]= temp;
            }
        }

        int secSmallest= arr[arr.length-2];

        return secSmallest;
    }

    public static void main(String[] args) {
        int arr[] = {23,53,5,5,75,45,2,34,467};
        System.out.println(secondSmallestNumb(arr));
    }
}
