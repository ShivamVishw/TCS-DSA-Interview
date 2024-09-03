package Arrays;

// Replace Each Element Of Array With Its Corresponding Rank

import java.util.HashMap;
import java.util.Arrays;
public class replaceElementByRank {
    
    static void replaceElementByItsRank(int arr[]){
        int n = arr.length;

        //take temp arr and copy alll element into that
        int[] temp = new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr[i];
        }

        HashMap<Integer, Integer> mp = new HashMap<>();

        Arrays.sort(temp);
        int rank=1;
        for(int i=0; i<n; i++){
            //update only if not visited already (It manage Duplicates as well so that same number will get same rank)
            if(mp.get(temp[i])==null){
                mp.put(temp[i], rank);
                rank++;
            }
        }

        //Now get Rank  
        for(int i=0; i<n; i++){
            System.out.print(mp.get(arr[i])+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,2,98,6};
        replaceElementByItsRank(arr);
    }
}
