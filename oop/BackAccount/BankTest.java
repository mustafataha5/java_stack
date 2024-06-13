public class BankTest {
    public static void main(String[] args){
        BankAccount account1= new BankAccount();
        BankAccount account2=new BankAccount();
        BankAccount account3=new BankAccount();
      
        account1.depositAmount(1, 100);
        account2.depositAmount(2, 500);
        account3.depositAmount(1,1000);

        account1.withdrawAmount(1, 50);
        account2.withdrawAmount(2, 100);
        account3.withdrawAmount(1, 400);
        System.out.println(BankAccount.getTotalMoney());
        System.out.println("Total accounts:" + " "+ BankAccount.getAccounts());
        System.out.println(BankAccount.getAccountNumbers());
    }
}