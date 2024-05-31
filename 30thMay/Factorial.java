public class Factorial {
    public static void main(String[] args) {
        int i;
        int num = 6;
        int temp = 1;
        for (i = 1; i<=num;i++){
            temp = temp*i;
        }
        System.out.println(temp);
    }
}
