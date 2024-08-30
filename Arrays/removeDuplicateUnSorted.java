package Arrays;


// Remove duplicates from unsorted array

import java.util.ArrayList;

public class removeDuplicateUnSorted {
    static ArrayList<Integer> removeDuplicateFrUnSorted(int []arr){

        int n=arr.length;
        //its sorted right

        ArrayList<Integer> result = new ArrayList<>();

        for (int numb=0; numb<n; numb++) {
            if(result.contains(arr[numb])){
                continue;
            }else{
                result.add(arr[numb]);
            }
        }

        return result;      
    }
    

    public static void main(String[] args) {
        int arr[] = {2,3,1,9,3,1,3,9};
        System.out.println(removeDuplicateFrUnSorted(arr));
    }
}
