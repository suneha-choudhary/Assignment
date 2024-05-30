class Pattern1 {
    static void Patt(int n,int k){
        int i;
        int j;
        for (i = 1; i<=k; i++){
            for (j = n; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[]args){
    Pattern1.Patt(6,7);
}
}

/* OUTPUT: ******
           *****
           ****
           ***
           **
           *
 */
