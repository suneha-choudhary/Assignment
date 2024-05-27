abstract class BankAcc{
abstract void Acc_No();
}
class P_Info extends BankAcc{
    void Acc_No(){
    System.out.println("The name of customer is : Neha. The acc number is: 123455677 " );
    }

public static void main(String args[]){
    BankAcc n = new P_Info();
    n.Acc_No();
}
}
