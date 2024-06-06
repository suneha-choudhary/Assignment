import java.util.ArrayList;

public class Vowels{
    ArrayList<Character> arr;

    Vowels(){
        arr = new ArrayList<>();
        arr.add('A');
        arr.add('a');
        arr.add('E');
        arr.add('e');
        arr.add('I');
        arr.add('i');
        arr.add('O');
        arr.add('o');
        arr.add('U');
        arr.add('u');
    }

    private boolean isVowel(char c){
        for(int i = 0; i< arr.size() ; i++){
        if (c == arr.get(i)){
            return true;
        }
    }
    return false;
        }
        public int countVowels(String s){
            int count = 0;
            int size = s.length();
            for(int j = 0; j<size; j++){
                char c = s.charAt(j);
                if(isVowel(c)){
                    count = count+1;
                }
            }
            return count;
        }

    public static void main(String[]args){
        Vowels obj = new Vowels();
        String str = "Hello World! Hello Java!";
        int noOfVowel = obj.countVowels(str);
        System.out.println("String is :" + str);
        System.out.println("The number of vowels are: " + noOfVowel);
        
    }
}
