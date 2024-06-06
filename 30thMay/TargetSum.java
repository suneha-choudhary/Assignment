public class TargetSum {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,8};
        int targetsum = 7;
        System.out.println("The sets of two for sum "+ targetsum +" are : ");
        
        for(int i = 0; i<arr.length-1; i++){
            int x = arr[i];
            for (int j=arr.length-1; j>=0; j--){
                int y = arr[j];
            if ((x + y) == targetsum && x != y){
                System.out.println("{"+x+","+y+"}");
            }
            }
        }
    }
}