package edu.nileuniversity;

//Student class inherits Person class by using the keyword extends.
//Student class must provide the implementation for the abstract method study
public class Student extends Person{
    public int yearOfGrad = 2024;
    public boolean mode;

    private double cgpa;

    @Override
    public void studyMode() {
        System.out.println("I am studying Full Time");
    }

    public void studyMode(boolean mode) {
        System.out.println("I am studying Part Time");
    }

    public void setCgpa(double cgpa){ //This is the setter method
        this.cgpa = cgpa;
    }

    public double getCgpa(){ //This is the getter method
        return cgpa;
    }
}
