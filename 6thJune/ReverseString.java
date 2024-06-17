public class ReverseString {
    public static void main(String[]args){
        String s = "SUNEHA";
        System.out.println("The original String is: " + s);
        char arr[] = new char[s.length()];
        char arr1[] = s.toCharArray();
        
        System.out.print("The reversed String is: ");
        for(int i = arr.length-1; i>=0; i--){
            arr1[i] = s.charAt(i);
            System.out.print(arr1[i]);
        }
        System.out.println();
    }
    
}

//OUTPUT:---------
// The original String is: SUNEHA
// The reversed String is: AHENUS