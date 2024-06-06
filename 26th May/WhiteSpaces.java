public class WhiteSpaces {
    public static void main(String[] args) {
        String s = "Surendra S i ng h Ch oud hary";
        System.out.println("The string with whitespaces is: " + s);

        String s1 = s.replaceAll(" ", "");

        System.out.println("String after removing whitespaces is: " + s1);
    }
}
