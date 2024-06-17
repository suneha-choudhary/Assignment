public class Pangram {
    public static boolean isPangrsam(String s ){
        if(s == null || s.isEmpty()){
            return false;
        }
        boolean[] seenletters = new boolean[26];
        s = s.toLowerCase();

        for(char c : s.toCharArray()){
            if(c >= 'a' && c<= 'z'){
                int index = c-'a';
                seenletters[index] = true;
            }
        }
        for(boolean seen : seenletters){
            if(!seen){
                return false;
            }
        }
        return true;
}


    public static void main(String[] args) {
        String s = "abcdefghijkopqrstuvwxyz";
        System.out.println("The string is : " + s);

        if(isPangrsam(s)){
        System.out.println("Yes the string is pangram");
    }
    else{
        System.out.println("No the string is not pangram");
    }
}
}
