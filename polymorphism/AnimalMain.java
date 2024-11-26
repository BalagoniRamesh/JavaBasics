package polymorphism;

import java.util.Scanner;
public class AnimalMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {   //Continuously execute the following block of code
        System.out.print("Enter animal type (dog, cat, or bird): ");
        String animalType = scanner.nextLine();

        Animal animal;

        switch (animalType) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            case "bird":
                animal = new Bird();
                break;
            default:
                System.out.println("Invalid animal type");
//                scanner.close();

                return;
        }
        
        animal.makeSound();
        animal.move();
        }
    }
}
