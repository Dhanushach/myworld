package javapracticing;
public class BankAccount {
String accountNumber = "456836965";
int balance = 30000;
public int Deposit(int amount1)
{
balance = balance + amount1;
return balance;
}
public int Withdraw(int amount2) {
balance = balance - amount2;
return balance;
}
public static void main(String[] args)
{
BankAccount acc = new BankAccount();
System.out.println("After deposit current balance is:" + acc.Deposit(20000));
System.out.println("After withdraw current balance is:" + acc.Withdraw(4000));
}
}

