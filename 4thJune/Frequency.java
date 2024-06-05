public class Frequency {
    public static void main(String[]args){
        int arr1[] = {2,2,6,8,7,6,8,7,7,7,7,7};
        int arr2[] = new int[arr1.length];
        int repeat = -1;
        for(int i = 0 ; i<arr1.length ; i++){
            int count = 1;
            for (int j = i+1; j<arr1.length;j++){
                if(arr1[i] == arr1[j]){
                count++ ;
                // break;
                arr2[j] = repeat;
                }
            }
            if (arr2[i] != repeat)
                arr2[i] = count;
        }
            for(int i = 0 ; i<arr2.length ; i++){
                if (arr2[i] != repeat){
                System.out.println(arr2[i]);
                }
            }
    }
}

