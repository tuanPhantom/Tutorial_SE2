package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.valueOf(scanner.nextLine());
        try {
            Child child = new Child(name, age);
            System.out.println(child.toString());
            Person p = new Person(name, age);
            System.out.println(p.toString());
            Person c = new Child(name, age);
            System.out.println(c.toString());

            String personClassName = Person.class.getSimpleName();
            String childClassName = Child.class.getSimpleName();
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
