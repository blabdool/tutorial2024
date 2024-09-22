package edu.nileuniversity;

public class ExampleDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while(i<5);
        System.out.println("This is printing outside the Do-While loop");
    }
}
