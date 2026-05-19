package com.pluralsight.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person person1 = new Person("James", "Carter", 34);
        people.add(person1);
        Person person2 = new Person("Sofia", "Nguyen", 27);
        people.add(person2);
        Person person3 = new Person("Marcus", "Thompson", 41);
        people.add(person3);
        Person person4 = new Person("Elena", "Rodriguez", 23);
        people.add(person4);
        Person person5 = new Person("David", "Kim", 55);
        people.add(person5);
        Person person6 = new Person("Priya", "Patel", 31);
        people.add(person6);
        Person person7 = new Person("Tyler", "Brooks", 19);
        people.add(person7);
        Person person8 = new Person("Amara", "Johnson", 38);
        people.add(person8);
        Person person9 = new Person("Lucas", "Fernandez", 46);
        people.add(person9);
        Person person10 = new Person("Hannah", "Lee", 22);
        people.add(person10);

        Scanner scanner = new Scanner(System.in);

        lookingForPeople(scanner, people);
        averageAge(people);
        oldestPerson(people);
        youngestPerson(people);


    }

    public static void lookingForPeople(Scanner scanner, List<Person> people) {
        System.out.print("What name are you looking for: ");
        String name = scanner.nextLine();

        List<Person> match = new ArrayList<>();

        for (Person person : people){
            if (person.getFirstName().equalsIgnoreCase(name) || (person.getLastName().equalsIgnoreCase(name))) {
                match.add(person);
            }
        }
        for (Person person : match) {
            System.out.println("Is this the person you are looking for?: " + person);
        }
    }

    public static void averageAge(List<Person> peoples) {
        double totalAge = 0;
        for (Person people : peoples) {
            totalAge += people.getAge();
        }
        System.out.println("Average for people age is: " + totalAge / peoples.size());
    }

    public static void oldestPerson(List<Person> peoples) {
        Person personOld = peoples.get(0);
        for (Person people : peoples) {
            if (personOld.getAge() < people.getAge()) {
                personOld = people;
            }
        }
        System.out.println("Oldest person is : " + personOld);
    }

    public static void youngestPerson(List<Person> peoples) {
        Person personYoung = peoples.get(0);
        for (Person people : peoples) {
            if (personYoung.getAge() > people.getAge()) {
                personYoung = people;
            }
        }
        System.out.println("Youngest person is : " + personYoung);
    }
}
