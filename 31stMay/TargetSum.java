public class TargetSum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,8};
        int targetsum = 9;
        int i;
        for(i = 1; i<arr.length; i++){
            if ((arr[i] + arr[i-1]) == targetsum){
                System.out.println(arr[i]);
                System.out.println(arr[i-1]);
            }
        }
        if ((arr[i] + arr[i-1]) != targetsum){
            System.out.println("Not found");
        }
    }
} 