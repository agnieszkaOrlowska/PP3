
public class BankAccount
{
  private int deposit;
  private int balance;
  private int withdraw;
  
  BankAccount(int balance){
      this.balance=balance;
  }
  public void deposit(int deposit){
      balance = balance + deposit;
  }
  
  public void displayBalance(){
      System.out.println(balance);
  }
  
  
  public void withdraw(int withdraw){
      if(balance<withdraw){
      balance=balance-withdraw;}
      else if(500<=withdraw){
          balance=balance-withdraw;
      }
      else{
          System.out.println("You cannot perform this action");
        }
      }
      
  }
  
  
