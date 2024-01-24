package Veterinarian;

/**
 * Class: Dog
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 15, 2024
 *
 * This class represents a dog, extending the Pet class.
 * It includes additional attributes specific to dogs such as breed type and color.
 */
public class Dog extends Pet {
    // Additional attributes for the Dog class
    private String breed;
    private String color;

    /**
     * Constructs a Dog object with the specified attributes.
     *
     * @param name  The name of the dog.
     * @param age   The age of the dog.
     * @param owner The owner's name of the dog.
     * @param type  The type of the pet.
     * @param breed The breed of the dog.
     * @param color The color of the dog's fur.
     */
    public Dog(String name, String owner, int age, String type, String breed, String color) {
        super(name, age, owner, type);
        this.breed = breed;
        this.color = color;
    }

    /**
     * Gets the breed of the dog.
     *
     * @return The breed of the dog.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Sets the breed of the dog.
     *
     * @param breed The breed to set.
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Gets the color of the dog's fur.
     *
     * @return The color of the dog's fur.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the dog's fur.
     *
     * @param color The color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean needSpecialHandle(Boolean need) {
        return false;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed: " + getBreed());
        System.out.println("Color: " + getColor());
    }
}