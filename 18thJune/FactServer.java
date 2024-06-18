import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FactServer {
    public static void main(String[] args) {
        try{
            System.out.println("Waiting for clients....");
            ServerSocket ss = new ServerSocket(9808);
            Socket soc = ss.accept();
            System.out.println("Connection Established");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number  = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println("Factorial of number " + number + " is : " + calculateFact(number));
            ss.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    static int calculateFact(int number){
        int fact = 1;
        for(int i = 1; i<= number; i++){
            fact = fact*i;
        }
        return fact;
    }
}
