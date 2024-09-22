package edu.nileuniversity;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog bingo = new Dog();
        bingo.animalSound();
        bingo.animalMovement();
        bingo.animalShelter();

        Bird b1 = new Bird();
        b1.animalMovement();
        b1.animalSound();
    }
}
