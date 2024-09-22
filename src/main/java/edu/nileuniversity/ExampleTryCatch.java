package edu.nileuniversity;

public class ExampleTryCatch {
    public static void main(String[] args) {
        try{
            int[] myNums = {1,2,3};
            System.out.println(myNums[0]); //what will this code evaluate to?
        } catch (Exception e){
            System.out.println("Something is wrong");
        }
    }
}
