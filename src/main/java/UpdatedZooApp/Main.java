package UpdatedZooApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<AnimalsInTheZoo> animalsInTheZooList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeMenu();

    }

    private static void welcomeMenu() {
        System.out.println("Welcome to the jungle, please make a choice:");
        System.out.println("1: Show animals");
        System.out.println("2: Add animal");
        System.out.println("3: Remove animal by name");
        System.out.println("4: Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            showMeAnimals();
            welcomeMenu();
        } else if (choice == 2) {
            populateZooAnimalList();
            welcomeMenu();
        } else if (choice == 3) {
            removeAnimalByName();
            welcomeMenu();
        }else if (choice == 4){
            System.exit(0);
        }
    }

    private static void showMeAnimals() {
        if (animalsInTheZooList.isEmpty()) {
            System.out.println("Zoo is empty, add something first");
        } else {
            for (AnimalsInTheZoo animalsInTheZoo : animalsInTheZooList) {
                System.out.println(animalsInTheZoo.introduceYourself());
            }
        }
    }

    private static void populateZooAnimalList() {
        System.out.println("which one? \n1. Hippo\n2. Tiger\n3. Zebra");
        int choice = scanner.nextInt();
        if (choice == 1) {
            createAnimalInTheZoo(choice);
        } else if (choice == 2) {
            createAnimalInTheZoo(choice);
        } else if (choice == 3) {
            createAnimalInTheZoo(choice);
        } else {
            System.out.println("wrong choice");

        }
    }

    private static void createAnimalInTheZoo(int input) {
        System.out.println("Give Name: ");
        String name = scanner.next();
        System.out.println("Give age: ");
        int age = scanner.nextInt();
        if (input == 1) {
            animalsInTheZooList.add(new Hippo(name, age));
        } else if (input == 2) {
            animalsInTheZooList.add(new Tiger(name, age));
        } else if (input == 3) {
            animalsInTheZooList.add(new Zebra(name, age));
        }
    }

    private static void removeAnimalByName() {
        System.out.println("Which one should be deleted?");
        String name = scanner.next();
        animalsInTheZooList.removeIf(animalsInTheZoo -> animalsInTheZoo.getName().equalsIgnoreCase(name));
    }

}
