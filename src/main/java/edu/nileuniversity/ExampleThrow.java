package edu.nileuniversity;

public class ExampleThrow {

    static void checkAge(int age){
        if (age<18){
            throw new ArithmeticException("Access denied - You must be at least 18 years or older to vote");
        }else{
            System.out.println("Access granted - You are old enough to vote");
        }
    }
    public static void main(String[] args) {
        checkAge(15);
        System.out.println("End of code");

    }
}
