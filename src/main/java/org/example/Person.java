package org.example;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    private String address;
    private String size;
    private int weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,
                  String address, String size, int weight) {

        this(firstName, lastName, age); // constructor chaining

        this.address = address;
        this.size = size;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}