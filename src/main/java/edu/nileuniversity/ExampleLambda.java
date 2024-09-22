package edu.nileuniversity;

import java.util.ArrayList;

public class ExampleLambda {
    public static void main(String[] args) {
        ArrayList<Integer> luckyNumbers = new ArrayList<>();
        luckyNumbers.add(6);
        luckyNumbers.add(16);
        luckyNumbers.add(28);
        luckyNumbers.add(31);
        luckyNumbers.add(1);

        luckyNumbers.forEach((n)->{
            System.out.println(n);
        });
    }
}
