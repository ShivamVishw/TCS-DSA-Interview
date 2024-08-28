package Arrays;
import java.util.Arrays;
public class insertElementinVarious {
    
    static int[] insertAtbegining(int[]arr, int value){
        
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1]= arr[i];
        }

        arr[0]=value;

        return arr;
    }

    static int[] insertAtEnd(int[]arr, int value){
        
        // for(int i=0; i<arr.length-2; i++){
        //     arr[i+1]= arr[i];
        // }

        arr[arr.length-1]=value; //just update last element

        return arr;
    }

    static int[] insertAtPos(int[]arr, int index, int value){
        for(int i=arr.length-1; i>=index; i--){
            arr[i]= arr[i-1];
        }
        arr[index-1]=value;
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={10,9,14,8,20,48,16,9,0};
        int value=40;
        int index = 5;

        System.out.println(Arrays.toString(insertAtPos(arr,index, value)));
    }
}
