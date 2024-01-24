package Veterinarian;

import java.io.*;
import java.util.*;
import java.util.Iterator;

/**
 * Class: PetApp
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 23, 2024
 *
 * This class Manage a list of pets
 */

public class PetManager {
    private List<Pet> pets;

    /**
     * Constructs a PetManager object.
     */
    public PetManager(){
        this.pets = new ArrayList<>();
    }

    /**
     * Add a new pet to the list.
     * @param pet The pet to be added.
     */
    public void addNewPet(Pet pet){
        pets.add(pet);
        System.out.println("New pet added successfully!");
    }

    /**
     * Load pets from a file.
     * @param fileName The name of the file to load pets from.
     */
    public void loadPetsFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read line: " + line);  // Add this line for debugging
                String[] petInfo = line.split("\\s+");
                Pet pet = createPetFromInfo(petInfo);
                if (pet != null) {
                    pets.add(pet);
//                    System.out.println(pet); // Debugging line
                }
            }
        } catch (FileNotFoundException e){ // I'm trying to see why I have trouble creating the pet list
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Error reading from file: " + fileName);
        }
    }

    /**
     * Create a Pet object from pet information.
     * @param petInfo An array containing pet information.
     * @return The created Pet object, or null if there's an issue.
     */
    private Pet createPetFromInfo(String[] petInfo) {
        if (petInfo.length < 4) {
            return null; // Insufficient information to create a Pet
        }

        Pet pet = null;
        String type = petInfo[0];
        String name = petInfo[1];
        String owner = petInfo[2];
        int age = Integer.parseInt(petInfo[3]);

        switch (type) {
            case "Dog" -> {
                if (petInfo.length >= 7) {
                    pet = new Dog(name, owner, age, petInfo[4], petInfo[5], petInfo[6]);
                }
            }
            case "Cat" -> {
                if (petInfo.length >= 8) {
                    pet = new Cat(name, owner, age, petInfo[4], petInfo[5], petInfo[6], petInfo[7]);
                }
            }
            case "OtherPet" -> {
                if (petInfo.length >= 7) {
                    pet = new OtherPet(name, owner, age, petInfo[4], petInfo[5], Boolean.parseBoolean(petInfo[6]));
                }
            }
            // Add more cases for other pet types if needed
        }
        System.out.println(pet); //Debugging line
        return pet;
    }

    /**
     * Save pets to a file.
     * @param fileName The name of the file to save pets to.
     */
    public void savePetsToFile(String fileName){
        try(PrintWriter pr = new PrintWriter(new FileWriter(fileName))){
            for (Pet pet : pets){
                pr.println(pet);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("File not found!");
        }
    }

    /**
     * Display information for all pets.
     */
    public void displayPets(){
        for (Pet pet : pets){
            pet.displayInfo();
            System.out.println("______________");
        }
    }

    /**
     * Find a pet by its name.
     * @param name The name of the pet to find.
     * @return The found Pet object or null if not found.
     */
    public Pet findByName(String name){
        for(Pet pet : pets){
            if(pet.getName().equalsIgnoreCase(name)){
                return pet;
            }
        }
            return null;
    }

    /**
     * Delete a pet by its name.
     * @param name The name of the pet to delete.
     */
    public void deletePetByName(String name){
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            if(pet.getName().equalsIgnoreCase(name)){
                iterator.remove();
                System.out.println("Pet with name: " + name + " deleted.");
                return;
            }
        }
        System.out.println("Pet with name: " + name + " not found!");
    }

    /**
     * Display information for all clients who own pets.
     */
    public void displayClients() {
        System.out.println("List of Clients:");

        for (Pet pet : pets) {
            String owner = pet.getOwner();
            System.out.println(owner);
        }

        System.out.println("______________");
    }

}
