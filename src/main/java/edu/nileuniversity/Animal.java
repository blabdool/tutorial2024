package edu.nileuniversity;

public interface Animal { //Animal is an interface
    public void animalSound(); //interface method does not have a body
    public void animalMovement(); //interface method does not have a body
}

interface Owner{
    public void animalShelter();
}

//Dog implements Animal interface
class Dog implements Animal, Owner{
    @Override
    public void animalSound() {
        System.out.println("The dog says: Woof woof!"); //The body of animalSound is provided here
    }

    @Override
    public void animalMovement() {
        System.out.println("A dog walks on four legs, wagging its tail."); //The body of animalSound is provided here
    }

    @Override
    public void animalShelter() {
        System.out.println("Building a kennel for the dog");
    }
}

//
class Bird implements Animal{
    @Override
    public void animalSound() {
        System.out.println("The bird says: Chirp chip!"); //The body of animalSound is provided here
    }

    @Override
    public void animalMovement() {
        System.out.println("A bird is Flying and perching."); //The body of animalSound is provided here
    }
}