import java.util.ArrayList;
import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,4,3,2,5,7,8,5,2,1,5,6};
        Arrays.sort(arr);
        int i;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        
        for(i = 0; i<arr.length; i++){
        boolean flag=true;
            for(int j = i+1; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    flag =false;
                    break;
                }
            }
            if(flag==true)temp.add(arr[i]);
        }
        System.out.println(temp);
    }
}
