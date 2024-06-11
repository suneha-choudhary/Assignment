public class largestSubstring {
    public static void main(String[] args) {

        String s = "abcbbcca";

        int max = 0;
        for(int i=0;i<s.length();i++){
            int subarray[] = new int[26];
            for(int j = i;j<s.length(); j++){
                
                if(subarray[s.charAt(j)-'a'] == 0){
                    subarray[s.charAt(j)-'a']++;
                    max=Math.max(max, j-i+1);
                }
                else break;
            }
        }
        System.out.println(max);
    }
}

