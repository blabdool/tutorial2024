package edu.nileuniversity;

public class NestedLoop {
    public static void main(String[] args) {
        // Outer loop
        for (int i = 1; i<=3; i++){
            System.out.println("This is printing in the Outer loop: "+ i); //How many times will this be executed? 3time

            //Inner loop
            for (int j = 1; j<=3; j++){
                System.out.println("This is printing in the Inner loop"+ j); //How many times will this be executed? 9 times
            }
        }
    }
}
