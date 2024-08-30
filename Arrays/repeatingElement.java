package Arrays;


// Find all repeating elements in an array
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class repeatingElement {
    static List<Integer> repeatingElementArr(int[] arr){
        HashMap<Integer, Integer> countMap = new HashMap<>();

        //now iterarte each element and get the count for each element
        for (int num : arr) {
            //get the curent count of element / default to 0 if not found
            int count = countMap.getOrDefault(num, 0);

            //now increment count by 1 if num is found
            countMap.put(num, count+1);
        }

        // Step 2: Create lists to separate repeating elements
        List<Integer> repeating = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            int element = entry.getKey();
            int count= entry.getValue();

            if(count>1){
                repeating.add(element);
            }
        }   

        return repeating;
    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,4,4,5,2};
        System.out.println(repeatingElementArr(arr));
    }
}
