import java.util.ArrayList;

class ToCheckVowels{
    String str;
    ArrayList<Character> arr;

    ToCheckVowels(){
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
    
    for(int i = 0;i< str.length() ; i++){
        if (arr[i] == str){
            return true;
        }
    }
    return false;

    }


public class Vowels {
    public static void main(String[]args){
        ToCheckVowels obj = new ToCheckVowels();
        obj.main("This is a String type object");
    }
}
