import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ExampleServer {
    static int operation(int number1 , int number2 , int op){
        int add = number1 + number2;
        int sub = number1 - number2;
        int mul = number1 * number2;
        int div = number1 / number2;
        int mod = number1 % number2;
        switch(op){
            case 1:
                return add;
            case 2:
                return sub;

            case 3:
                return mul;
            
            case 4:
                return div;
            
            case 5:
                return mod;
        }
        return 0;
}
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for clients....");
            ServerSocket ss = new ServerSocket(9810);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number1 = Integer.parseInt(in.readLine());
            int number2 = Integer.parseInt(in.readLine());
            int op = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("The result is : "+ ExampleServer.operation(number1,number2,op));
            ss.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
