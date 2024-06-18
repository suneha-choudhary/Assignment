import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ExampleClient {
    public static void main(String[] args) {
        try{
            System.out.println("Client Started");
            Socket soc = new Socket("localhost" , 9810);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number1: ");
            int number1 = Integer.parseInt(userInput.readLine());
            System.out.print("Enter a number2: ");
            int number2 = Integer.parseInt(userInput.readLine());
            System.out.println("Enter the opertion you want to perform : ");
            System.out.print("For Addition choose 1 : \n" + "For Subtraction choose 2 : \n" + "For Multiplication choose 3 : \n" +"For Division choose 4 : \n" + "For Modulous Choose 5 : \n" );
            int op  = Integer.parseInt(userInput.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(number1);
            out.println(number2);
            out.println(op);
            BufferedReader in  = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            soc.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}