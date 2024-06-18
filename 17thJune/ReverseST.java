public class ReverseST {

    static String reverse(String s){
        char[] c = s.toCharArray();
        int j = c.length-1;
        for(int i=0; i<c.length/2; i++){
            char temp =c[i];
            c[i]=c[j];
            c[j]=temp;
            j--;
    }
    return String.valueOf(c);
}


    public static void main(String[]args){
        String s = "MY NAME IS SUNEHA";
        String ans = "";
        String temp = "";

        for(int i = 0 ; i<=s.length()-1 ; i++){
            if(s.charAt(i) == ' ' ){
                ans += reverse(temp)+" ";
                temp="";
            }
            else{
                temp = temp + s.charAt(i);
            }
        }
        if(temp.length()>0) ans=ans+reverse(temp);
        System.out.println(ans);
    }
}

