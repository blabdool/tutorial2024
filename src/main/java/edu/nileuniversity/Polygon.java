package edu.nileuniversity;

public class Polygon {
    //method to render a shape
    public void render(){
        System.out.println("Rendering a Polygon");
    }
}

class Pentagon extends Polygon{
    //renders Pentagon
    public void render(){
        System.out.println("Rendering a Pentagon");
    }
}

class Square extends Polygon{
    //renders Square
    public void render(){
        System.out.println("Rendering a Square");
    }
}

class Triangle extends Polygon{
    //renders Triangle
    public void render(){
        System.out.println("Rendering a Triangle");
    }
}

class Circle extends Polygon{
    //renders Circle
    public void render(){
        System.out.println("Rendering a Circle");
    }
}
