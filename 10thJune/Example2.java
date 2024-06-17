public class Example2 {
        public static void main(String[] args) {

            int arr[]={6,3,-5,-1,0,3,1,-3,5,3,-2,4,-2,0};

            boolean temp[]= new boolean[arr.length];

            for(int i=0;i<arr.length;i++){
                if(arr[i]>=0){
                    temp[arr[i]]=true;
                }
            }
            int ans=0;
            for(int i=1;i<temp.length;i++){
                if(temp[i]==false){
                    ans=i;
                    break;
                }
            }

            System.out.println("The given array is : " );
            
            for(int i = 0 ; i<= arr.length-1; i++){
            System.out.print(arr[i] + ",");
            }
            System.out.println();
        System.out.println("The smallest missing positive number is: "+ ans);
    }
}
