package edu.nileuniversity;

public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount sa001 = new SavingsAccount(1000, 0.02, "David");
        SavingsAccount sa002 = new SavingsAccount(2000,"Ben");
        sa001.displayCustomer();
        sa001.deposit(10000);
        sa001.displayCustomer();
        System.out.println("The Interest for "+sa001.name+" is "+ sa001.calcInterest());
        sa001.balance += sa001.calcInterest(); //What is this code doing?
        sa001.displayCustomer();
        sa002.displayCustomer();


    }
}
