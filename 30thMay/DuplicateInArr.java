import java.util.Arrays;

public class DuplicateInArr {
    public static void main(String[] args) {
        int i;
        int [] arr = {9,4,1,6,5,7,2,4};
        Arrays.sort(arr);
        
        for(i = 1; i<arr.length; i++){
            if (arr[i] == arr[i-1]){
                break;
            }
        }
    System.out.println("Duplicate: " + arr[i]);
        
    }
}