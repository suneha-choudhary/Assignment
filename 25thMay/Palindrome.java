class Logic{
    static void n(String s){
        int n = s.length();
        s = s.toLowerCase();
    for (int i=0;i<n/2;i++){
        if (s.charAt(i) != s.charAt(n-1-i)){
            System.out.println("String is not palindrome");
            return;
        }
    }
        System.out.println("String is palindrome");
        return;

        }
    }
    
class Palindrome{
    public static void main(String[]args){
        Logic.n("Kanak");
    }
}
