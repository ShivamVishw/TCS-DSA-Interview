package Arrays;

public class maximumProductSub {
    static int maximumProduct(int[] arr, int n) {
		// Write your code here.

		int pre=1;
		int suff =1;
		int ans =Integer.MIN_VALUE;
		
		for(int i=0; i<n; i++){
			//base case 
			if(pre==0){
				pre=1;
			}
			if(suff==0){
				pre=1;
			}

			pre= pre*arr[i];

			suff= suff*arr[n-i-1];

			ans= Math.max(ans, Math.max(pre, suff));
            
            //to handle 0
			if (arr[i]== 0) {
                pre = 1;
            }
            if (arr[n-i-1] == 0) {
                suff = 1;
            }
		}
		return ans;
	}
    public static void main(String[] args) {
        int arr[] ={1,2,-3,0,-4,-5};
        int n= arr.length;
        System.out.println(maximumProduct(arr, n));
    }
}
