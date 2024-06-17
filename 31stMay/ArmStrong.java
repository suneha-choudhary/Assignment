class Example{
    static void Armstrong(int n){
        int temp=n;
        int sum=0;
        while(temp !=0){
            int x = temp % 10;            // x = 153 % 10 = 3         // x = 15 % 10 = 5              //x = 1 % 10 = 1
            temp  /= 10;                 // temp = 153 / 10 = 15     // temp = 15/10 = 1             // temp = 1/10 = 0
            sum += Math.pow(x, 3);    // sum = 3^3 = 27           // sum = 5^3 = 125+27 = 152     // sum = 1^3 = 152+1 = 153
        }
        if(sum==n){
        System.out.println("The number is armstrong Number");
        }
        else{
        System.out.println("The number is not armstrong Number");
        }
    }
}
    public class ArmStrong {
        public static void main(String[] args) {
            Example.Armstrong(153);
            
        }
}
