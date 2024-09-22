package edu.nileuniversity;

public class SavingsAccount {
    public double balance;
    public double interestRate = 0.01;
    public String name;

    public SavingsAccount(double bal, String aName){
        balance = bal;
        name = aName;
    } //end of constructor 1

    // You can write more than one constructor in a class. This is known as overloading a constructor
    // A class may have unlimited number of constructors

    public SavingsAccount(double bal, double intRate, String aName){
        balance = bal;
        interestRate = intRate;
        name = aName;
    } //end of constructor 2



    public void displayCustomer(){
        System.out.println("Customer: "+name);
        System.out.println("Balance: "+balance);
        System.out.println("Rate: "+interestRate);
    } //end method displayCustomer

    public void deposit(int amt){ //Scope of amt
        balance += amt; //What is this code doing balance = balance+amount
    } //end of method deposit

    //write a method to calculate interest on an account
    //It is possible to get the value of a local variable out of the method
    // Write a return statement and
    // Change the method type from void to the type that you want returned
    public double calcInterest(){
        double interest = balance*interestRate/12;
        return interest;
    }//end method calcInterest

}
