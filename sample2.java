 package demoJ;
import java.util.*;
public class Bank {
    public static void main(String[] args){
       BankDetails bank=new BankDetails(10000,2000,18000);
         bank.deposit();
         bank.withdrawn();
         bank.balance();
       }
    }

class BankDetails{
   int withdrawnA;
    float depositA;
    float balanceA;
    public BankDetails(float depositA,int withdrawnA,float balanceA)
    {
        this.depositA=depositA;
        this.withdrawnA=withdrawnA;
        this.balanceA=balanceA;
    }
    public void  deposit(){
        System.out.println("Enter amount to deposit:"+depositA);
       System.out.println("The deposited amount is:"+depositA);
    }
    public void withdrawn(){
        System.out.println("the amount withdrawn is:"+withdrawnA);
    }
    public void balance(){
        balanceA=depositA+balanceA-withdrawnA;
        System.out.println("bank balance is:"+balanceA);
    }
}
