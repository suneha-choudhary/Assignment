import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int arr1 [] = {22,33,4,5,54,2,21,11};
        int arr2 [] = {12,24,54,66,5,33,11};
        int arr3 [] = {13,43,66,33,67,11,33,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        
        int x = 0;
        int y = 0;
        int z = 0;
        boolean flag = false;
        System.out.println("The common elements in arrays are: ");
        while(x < arr1.length && y < arr2.length && z < arr3.length){
            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]){
                flag = true;
                System.out.println(arr1[x] + " ");
                x++;
                y++;
                z++;
            }
            else if(arr1[x] > arr2[y]){
                y++;
            }
            else if(arr2[y] > arr3[z]){
                z++;
            }
            else{
                x++;
            }
        }
        if(!flag){
            System.out.println("None");
        }
    }
}
