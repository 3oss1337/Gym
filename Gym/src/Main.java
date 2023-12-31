import Users.*;
import GymDetails.*;
import Users.Customer.Customer;

import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Gym.listOfCoaches.addAll((ArrayList<Coach>) Gym.loadFromFile("Coach.txt"));
        Gym.listOfCustomers.addAll((ArrayList<Customer>) Gym.loadFromFile("Customer.txt"));
        Gym.listOfSystemUsers.addAll((ArrayList<SystemUser>) Gym.loadFromFile("Receptionist.txt"));
        Gym.listOfEquipments.addAll((ArrayList<Equipment>) Gym.loadFromFile("Equipment.txt"));

        Gym.displayCoaches(Gym.listOfCoaches);
        Gym.displayCustomers(Gym.listOfCustomers);

        Gym.displaySystemUsers(Gym.listOfSystemUsers);
        Gym.displayEquipments();

        char c;
        do {
            Gym.mainMenu();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Press y to continue n to exit");
            c = scanner.nextLine().charAt(0);

        } while (c != 'N' && c != 'n');

        Gym.saveToFile(Gym.listOfCoaches, "Coach.txt");
        Gym.saveToFile(Gym.listOfCustomers, "Customer.txt");
        Gym.saveToFile(Gym.listOfSystemUsers, "Receptionist.txt");
        Gym.saveToFile(Gym.listOfEquipments, "Equipment.txt");

    }
}