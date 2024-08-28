package Arrays;

public class elementFreq {
    static void freqOfElement(int arr[]){

        boolean[] visited= new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            if(visited[i]==true){
                continue;
            }else{

                int count=1;
                for(int j=i+1; j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                System.out.println(arr[i]+" present "+ count+" times");
            }
        }

    }
    public static void main(String[] args) {
        int arr[]= {1, 2, 8, 3, 2, 2, 2, 5, 1};
        freqOfElement(arr);
    }
}
