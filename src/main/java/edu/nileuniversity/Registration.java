package edu.nileuniversity;

public class Registration {
    public static void main(String[] args) {
        Student sid01 = new Student();
        Student sid02 = new Student();
        sid02.fName = "Femi";
        sid02.lName = "Joshua";
        sid02.age = 26;




        System.out.println("My name is "+sid01.fName+" "+ sid01.lName+" and I am "+sid01.age+" years old. I am graduating in "+sid01.yearOfGrad);//
        sid01.studyMode();
        sid01.setCgpa(4.59);
        System.out.println("My CGPA is: "+sid01.getCgpa());


        System.out.println("");
        sid02.yearOfGrad+=2;
        System.out.println("My name is "+sid02.fName+" "+ sid02.lName+" and I am "+sid02.age+" years old. I am graduating in "+sid02.yearOfGrad);
        sid02.studyMode(sid02.mode);


    }
}
