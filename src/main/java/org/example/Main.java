package org.example;

public class Main {

    public static void main(String[] args) {

        // Person
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Doe", 18,
                "Ankara", "M", 60);

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("-------------------");

        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Is Teen: " + person2.isTeen());

        System.out.println("===================");

        // Wall
        Wall wall = new Wall(5, 4);

        System.out.println("Area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("Width= " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("Area= " + wall.getArea());
    }
}