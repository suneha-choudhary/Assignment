public class Pattern2 {
    static void Patt(int n , int m){
        int i;
        int j;
        for (i = 1; i <= n ; i++){
            for(j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int k;
        int l;
        for (k = 1; k <= m ; k++){
            for(l = m; l >= k; l--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        Pattern2.Patt(4,5);
    }
}

/*
OUTPUT:-------------
*
**
***
****
*****
****
***
**
*

 */
