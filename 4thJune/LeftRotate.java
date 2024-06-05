public class LeftRotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = 2;
        int j;

        System.out.println("Original Array is: ");
        for (int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i<n ; i++){
            int first_index = arr[0];
            for (j=0 ; j<arr.length-1 ; j++){
                arr[j] = arr[j+1];
            }
            arr[j] = first_index;
        }

    System.out.println();
    System.out.println("Left rotated array is: ");
    for (int i = 0;i<arr.length;i++){
    System.out.print(arr[i] + " ");
    }
    }
} 
