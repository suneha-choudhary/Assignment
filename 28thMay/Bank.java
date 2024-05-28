public class Bank {
    public static int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    public static int getRateOfInterest(){
        return 9;
    }
}
class ICICI extends Bank{
    public static int getRateOfInterest(){
        return 7;
    }
}
class AXIS extends Bank{
    public static int getRateOfInterest(){
        return 8;
    }


public static void main(String [] args){
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
    System.out.println(s.getRateOfInterest());
}
}
