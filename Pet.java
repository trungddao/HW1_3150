package Veterinarian;

/**
 * Class: Pet
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 15, 2024
 *
 * This class represents a generic pet with common attributes such as name, age, owner, and type.
 */
public abstract class Pet {
    // Attributes for the Pets class
    private String name;
    private int age;
    private String owner;
    private String type;
    private boolean needSpecialCare;

    /**
     * Constructs a Pets object with the specified attributes.
     *
     * @param name  The name of the pet.
     * @param age   The age of the pet.
     * @param owner The owner's name of the pet.
     * @param type  The type of the pet.
     */
    public Pet(String name, int age, String owner, String type) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.type = type;
        this.needSpecialCare = needSpecialCare;
    }

    /**
     * Gets the name of the pet.
     *
     * @return The name of the pet.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the pet.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the pet.
     *
     * @return The age of the pet.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the pet.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the owner's name of the pet.
     *
     * @return The owner's name of the pet.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the owner's name of the pet.
     *
     * @param owner The owner's name to set.
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Gets the type of the pet.
     *
     * @return The type of the pet.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the pet.
     *
     * @param type The type to set.
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Checks if the pet requires special care.
     *
     * @return True if the pet requires special care, false otherwise.
     */
    public boolean isNeedSpecialCare() {
        return needSpecialCare;
    }

    /**
     * Sets whether the pet requires special care.
     *
     * @param needSpecialCare True if the pet requires special care, false otherwise.
     */
    public void setNeedSpecialCare(boolean needSpecialCare) {
        this.needSpecialCare = needSpecialCare;
    }

    public abstract boolean needSpecialHandle(Boolean needSpecialCare);


    // Add a method to display pet information
    public void displayInfo() {
        System.out.println("Pet Type: " + getType());
        System.out.println("Name: " + getName());
        System.out.println("Owner: " + getOwner());
        System.out.println("Age: " + getAge());
    }


}