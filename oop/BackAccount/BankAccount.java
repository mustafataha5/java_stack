import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber; 
    private static Set<String> accountNumbers = new HashSet<String>();
    private static int accounts;
    private static double totalMoney; 

    // CONSTRUCTOR
public BankAccount(){
    this.checkingBalance= 0;
    this.savingsBalance= 0;
    accounts++;
    accountNumber=generateAccountNumber();
    
}
    public static int getAccounts() {
        return accounts;
    }
    public static Set<String> getAccountNumbers() {
        return accountNumbers;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public double getSavingsBalance() {
        return savingsBalance;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    // METHODS
    public void depositAmount(int type, double amount){
        if (amount >0){
        if (type == 1){
            this.checkingBalance += amount;
            totalMoney+= amount;
        }
        else if (type == 2){
            this.savingsBalance += amount;
            totalMoney+=amount;
        }
        else{
            System.out.println("Invalid transaction, (Type must be one or two)");
        }}
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdrawAmount(int type, double amount){
        if (type==1 && amount <= this.checkingBalance){
            this.checkingBalance -= amount;
            totalMoney -= amount;
        }
        else if (type ==2 && amount <= this.savingsBalance){
            this.savingsBalance -= amount;
            totalMoney-=amount;
        }
        else{
            System.out.println("Invalid transaction due to insufficient funds or invalid type");
        }
    }
    public void displayBalance(){ 
        System.out.println("Account:" + " "+ this.accountNumber);
        System.out.println("Checking Balance:"+ " "+this.checkingBalance);
        System.out.println("Saving Balance:"+ " "+this.savingsBalance);
    }
    private String randomizeAccountNumber(){
        int [] alpha = {0,1,2,3,4,5,6,7,8,9} ; 
        Random randMachine = new Random();
        String account = "" ;                 
        for(int i=0;i<10;i++){
            account += alpha[randMachine.nextInt(10)] ; 
        }
        return account;
       }
    private String generateAccountNumber(){
        String account= randomizeAccountNumber();
        while  (accountNumbers.contains(account)){
            account= randomizeAccountNumber();
            }
            accountNumbers.add(account);
            return account;
    }
    
}