package NumbersProblem;

// Replace all the 0’s with 1 in a given integer
public class replaceZeroWithOne {
    static char[] replaceZeroWithOneNumb(int num){
        String numb = Integer.toString(num);
        char arr[] = numb.toCharArray();

        for(int i=0;i<arr.length; i++){
            if(arr[i]=='0'){
                arr[i]='1';
            }
        }
        
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(replaceZeroWithOneNumb(4030208));
    }
}
