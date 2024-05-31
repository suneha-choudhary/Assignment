public class PrimeNum {
    public static void main(String[] args) {
        
        int i;
        int j;
        int num = 15;
        int temp = 0;

        for (i= 1; i<num ; i++){
            for (j = 2; j<i-1 ; j++){
                if(i%j == 0){
                temp = temp+1;
                }
            }
            if (temp == 0){
                System.out.println(i);
            }
            else{
                temp = 0;
            }
            
        }
    }
}