package edu.nileuniversity;

public class ExamplePolymorphism {
    public static void main(String[] args) {
        //create an object of Square
        Square sq1 = new Square();
        sq1.render();


        //create an object of Circle
        Circle c1 = new Circle();
        c1.render();

        //create an object of Polygon
        Polygon p1 = new Polygon();
        p1.render();
    }
}
