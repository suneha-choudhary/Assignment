public class ThirdMin {
    public static int thirdmin(int arr[]){
        int i ;
        int j;
        int temp;
        
        System.out.println("The 3rd minimum number from the array ");
        for(i = 0; i<arr.length ; i++){
            for(j = i+1 ; j<arr.length ; j++){
                if (arr[i] > arr[j] && arr[i]!= arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[2];
        }
    public static void main(String[]args){
        int arr[] ={2,4,5,7,8,3,4,6,7,5};
        System.out.println(thirdmin(arr));
    }
}