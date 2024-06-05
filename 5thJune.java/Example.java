// BY ARRAY :-----------------------------------------
public class Example {
    public static void main(String[] args) {
        String arr1[] = {"a","a","b","b","a","a","c","c","b","b","c"};
        int arr2[] = new int[arr1.length];
        int repeat = -1;
        for(int i = 0 ; i<arr1.length ; i++){
            int count = 1;
            for (int j = i+1; j<arr1.length;j++){
                if(arr1[i] == arr1[j]){
                count++ ;
                arr2[j] = repeat;
                }
            }
            if (arr2[i] != repeat)
                arr2[i] = count;
        }
            for(int i = 0 ; i<arr2.length ; i++){
                if (arr2[i] != repeat){
                System.out.println(arr2[i] + arr1[i]);
                }
            }
    }
}


//BY STRING :------------------------------------

// public class Example{
//     public static void main(String[] args) {
//         String s = "aaaabbbcccccc";
//         int i;
//         int count = 1;

//         for (i = 0;i<s.length();i++){
//                 if(i+1<s.length() && s.charAt(i) == s.charAt(i+1)){
//                     count++;
//                 }
//                 else{
//                     System.out.print(s.charAt(i));
//                     System.out.println(count);
//                     count = 1;
//                 }
//         }
//     }
// }


// public class Example{
//     public static void main(String[] args) {
    // String s = "aacccc";
    // int i = 0;
    // int count = 1;
    // while(i<s.length()){
    //     char ch = s.charAt(i);
    //     if ((i+1)<s.length() && ch==s.charAt(i+1)) {
    //     count++;
    //     i++;
    //     }
    //     else{
    //         System.out.print(ch);
    //         System.out.println(count);
    //         i = i+count+1;
    //     }
    // }
//     }
//}
