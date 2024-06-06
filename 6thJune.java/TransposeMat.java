public class TransposeMat {
    public static void main(String[]args){
        int arr1[][] = {{1,2,3},{4,5,6},{5,6,7}};
        int arr2[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
            arr2[i][j] = arr1[j][i];
        }
        }
        System.out.println("The elements before transpose is : ");
        for(int i = 0; i<3 ;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j] + " ");
        }
        System.out.println();
        }

        System.out.println("The elements after transpose is : ");
        for(int i = 0; i<3 ;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+ " ");
        }
        System.out.println();
        }
    }
}