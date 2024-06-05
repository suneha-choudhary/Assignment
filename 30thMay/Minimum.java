public class Minimum{    
    static void Min(){
        int i;
        int arr[] = {0,-1,-5,4,2,5,8,1,3,9,2,10};
        int min = arr[0];
        for(i = 1;arr.length > i; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value is : " + min);
    }

public static void main(String[]args){
    Minimum.Min();
}
}

