package Arrays;

import java.util.HashMap;

public class allSymmetricPair {
    static void symmetricPairArr(int arr[][]){
        
        HashMap<Integer, Integer> pairMap = new HashMap<Integer,Integer>();


        for(int[] pair: arr){
            int first = pair[0];
            int second = pair[1];


            // if second key present in map and ifpresent then is there value equal to first element
            // pairMap.containsKey(second) getting key  pairMap.get(second)==first  checking if value is equal to first
            if(pairMap.containsKey(second) && pairMap.get(second)==first){
                System.out.println("(" + second + ", " + first + ") and (" + first + ", " + second + ")");
            } else {
                pairMap.put(first, second);
            }
        }
        
    }
    public static void main(String[] args) {
        int arr[][] ={{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        symmetricPairArr(arr);
    }
}


