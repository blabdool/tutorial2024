package edu.nileuniversity;

public class Main {
    int x =5;
    float y=3.14f;

    //Example of a static method
    static void myMethod(){
        System.out.println("This is printing within myMethod!");
    }
    public static void main(String[] args) {
        //myMethod();
        Main myObj1 = new Main();
        System.out.println(myObj1.x);

        Main myObj2 = new Main();
        System.out.println(myObj2.y);

        myMethod();


    }

}
