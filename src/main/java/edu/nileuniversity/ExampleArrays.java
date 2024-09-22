package edu.nileuniversity;

public class ExampleArrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myScores = {90, 85, 99, 100, 85};
        char[] allGrades = {'A', 'B', 'C', 'D', 'E', 'F'};

        System.out.println(cars[0]);



        // How can we access Grade F?
        System.out.println(allGrades[allGrades.length-1]);

        //How can we access the second to the last score in the array?
        System.out.println(myScores[myScores.length-2]);

        //How can we change the first element in the array cars from Volvo to Opel?
        cars[0]="Opel";
        System.out.println(cars[0]);


        //Looping through an Array
        for (int i = 0; i< cars.length; i++){
            System.out.println(cars[i]);
        }

        //Alternative way to Loop Through an Array Using the for-each construct
        //Syntax for(type variable:arrayName){
        // }
        for(char i:allGrades){
            System.out.println(i);
        }
    }
}
