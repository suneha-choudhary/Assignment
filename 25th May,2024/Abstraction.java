abstract class BankAcc{
abstract void Acc_No();
abstract void Customer_name();
}
class P_Info extends BankAcc{
    void Acc_No(){
        int acc_num = 45253841;
        System.out.println("The acc number is: " + acc_num );
    }
    void Customer_name(){
        String name = "Neha";
        System.out.println("The name of customer is: "+ name);
    }

public static void main(String args[]){
    BankAcc n = new P_Info();
    n.Acc_No();
    n.Customer_name();
}
}
