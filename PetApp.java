package Veterinarian;

import java.util.Scanner;

/**
 * Class: PetApp
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 23, 2024
 *
 * This class is the main application for managing pets
 */

public class PetApp {
    public static void main(String[] args) {
        // Create an instance of PetManager to manage pets
        PetManager petManager = new PetManager();
        //Load pets from a file
        petManager.loadPetsFromFile("src/Veterinarian/PetList.txt");

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Display Menu and process user input until the user chooses to exit
        while (choice != 6) {
            displayMenu();

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                petManager.displayPets();
            } else if (choice == 2) {
                petManager.displayClients();
            } else if (choice == 3) {
                findPetByName(scanner, petManager);
            } else if (choice == 4) {
                deletePetByName(scanner, petManager);
            } else if (choice == 5) {
                // Add a new pet
            } else if (choice == 6) {
                petManager.savePetsToFile("src/Veterinarian/PetList.txt");
                System.out.println("Changes saved. Exiting Program.");
            } else {
                System.out.println("Invalid choice. Please enter a valid option");
            }
        }
    }


    /**
     *     Display the menu option
      */
    public static void displayMenu(){
        System.out.println("1. Display Pets");
        System.out.println("2. Display client list");
        System.out.println("3. Find pet by name");
        System.out.println("4. Delete pet by name");
        System.out.println("5. Add new pet");
        System.out.println("6. Save and Exit");

    }

    /**
     * Find a pet by its name
     * @param scanner The scanner for user input.
     * @param petManager The PetManager instance.
     */
    private static void findPetByName(Scanner scanner, PetManager petManager){
        System.out.println("Enter pet name to find: ");
        scanner.nextLine();
        String findName = scanner.nextLine();
        Pet foundPet = petManager.findByName(findName);
        if (foundPet != null){
            foundPet.displayInfo();
        }else {
            System.out.println("Pet with name: " + findName + " is not found");
        }
    }

    /**
     * Delete a pet by its name
     * @param scanner The scanner for user input.
     * @param petManager The PetManager instance.
     */
    private static void deletePetByName(Scanner scanner, PetManager petManager){
        System.out.println("Enter pet name to delete: ");
        scanner.nextLine();
        String deleteName = scanner.nextLine();
        petManager.deletePetByName(deleteName);
    }


}
