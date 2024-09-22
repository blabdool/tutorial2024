package edu.nileuniversity;

public class ExampleWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            if (i==3){
                continue;
            }
            System.out.println(i);

            i++;
        }
        System.out.println("This is printing outside the While loop");
    }
}
