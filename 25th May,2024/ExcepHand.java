public class ExcepHand{
    public static void main(String[]args){
        try{
            int num = 45/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Example of exception handling");
        }
        System.out.println("Program continues.....");
    }
}
