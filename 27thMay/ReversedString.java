public class ReversedString {
    public static void main(String[] args) {
        String s = "S u n e h a";
        char temp[] = new char[s.length()];

        char[] c = s.toCharArray();
        int j = c.length-1;
        for(int i=0; i<c.length/2; i++){
            temp[i]=c[i];
            c[i]=c[j];
            c[j]=temp[i];
            j--;
        }
        String reversed = String.valueOf(c);
        System.out.println("Reversed String:--- " + reversed);
    }
}

