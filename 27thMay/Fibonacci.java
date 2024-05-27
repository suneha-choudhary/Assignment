class Num{
    int n1;
    int n2;
    int sum;

void s(int n1,int n2,int sum){
    // n1 = 0;
    // n2 = 1;
    // sum = 0;
    System.out.println(n1);
    System.out.println(n2);

    for (int i = 2 ; i<10 ; i++ ){
        sum = n1 + n2;
        System.out.println(sum);
        n1 = n2;
        n2 = sum;
    }

}
}
class Fibonacci{
    public static void main(String[]args){
        Num n = new Num();
        n.s(0,1,0);
        

    }
}