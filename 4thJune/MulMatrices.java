public class MulMatrices{
    public static void main(String[] args) {
        int arr1[][] = {{1,2,3},{3,4,5},{5,6,7}};
        int arr2[][] = {{1,2,3},{3,4,5},{5,6,7}};

        int arr3[][] = new int[3][3];
        int i ;
        int j ;
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr3[i][j] = arr1[i][j]*arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}