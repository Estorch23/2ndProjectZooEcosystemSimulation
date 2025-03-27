package org.example;

public class ZooSimulation {
    public static void main(String[] args) {

        AnimalBehavior.Animal lion =new AnimalBehavior.Lion("King",12);
        lion.eat();
        lion.makeSound();;
        lion.sleep();
        lion.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Elephant Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation()*/

        AnimalBehavior.Animal elephant=new AnimalBehavior.Elephant("Gordo",23);
        elephant.eat();
        elephant.makeSound();
        elephant.sleep();
        elephant.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Parrot Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation()*/

        AnimalBehavior.Animal parrot=new AnimalBehavior.Parrot("Dummie",3);
        parrot.eat();
        parrot.makeSound();
        parrot.sleep();
        parrot.displayInformation();
        System.out.println();

        /*Create an object of the Animal using Eagle Class Constructor and
         Call the methods eat(), makeSound(), sleep() and displayInformation() */

        AnimalBehavior.Animal eagle=new AnimalBehavior.Eagle("Storm",5);
        eagle.eat();
        eagle.makeSound();
        eagle.sleep();
        eagle.displayInformation();
        System.out.println();

        Registration register=new Registration();
        register.setEmail("userEmail@yahoo.com");
        register.setUserName("ZooEco22");
        register.setPassword("PassCode2025");
        register.displayRegistration();
    }
}

