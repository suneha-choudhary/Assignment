class MaxValue{
    static void Maximum(int n){
        int i;
        int arr[] = {4,2,5,8,1,3,9,2,10};
        int maxim = arr[0];
        for(i = 1;arr.length > i; i++){
            if (arr[i] > maxim){
                maxim = arr[i];
            }
        }
        System.out.println("The maximum value is: " + maxim);
    }

public static void main(String[]args){
    MaxValue.Maximum(10);
}
}

