public class RightRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = 3;
        int i;
        int j;
        int k = arr.length;
        int temp;

        System.out.println("Original Array is: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
        for (j = 1;j<=n;j++){
            temp = arr[k-1];
            for (i=k-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0] = temp;
        }
        System.out.println();
        
        System.out.println("Right rotated array is: ");
        for(i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }





    }
}
