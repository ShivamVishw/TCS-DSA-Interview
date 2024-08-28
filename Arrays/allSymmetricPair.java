package Arrays;

import java.util.List;

import java.util.HashMap;
import java.util.Map;

public class allSymmetricPair {
    static List<Integer> symmetricPairArr(int arr[][]){
        
        HashMap<Integer, Integer> countMap = new HashMap<>();


        // Step 2: Create lists to separate repeating elements
        List<Integer> nonRepeating = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry: countMap.entrySet()){
            int element = entry.getKey();
            int count= entry.getValue();

            if(count>1){
                continue;
            }else{
                nonRepeating.add(element);
            }
        }   

        return nonRepeating;
    }
    public static void main(String[] args) {
        int arr[][] ={{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        System.out.println(symmetricPairArr(arr));
    }
    }
}

