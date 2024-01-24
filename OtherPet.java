package Veterinarian;

/**
 * Class: Other pet
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 15, 2024
 *
 * This class represents other type of pet, extending the Pet class.
 * It includes additional attributes specific to a type of pet such as pet type and indicates whether the pet requires special care .
 */

public class OtherPet extends Pet {
    // Additional attributes for the OtherPet class
    private String petType;
    private boolean needSpecialCare;


    /**
     * Constructs an OtherPet object with the specified attributes.
     *
     * @param name             The name of the pet.
     * @param age              The age of the pet.
     * @param owner            The owner's name of the pet.
     * @param type             The type of the pet.
     * @param petType          The specific type of the other pet (e.g., snake, bird, lizard, hamster, etc.).
     * @param needSpecialCare  Indicates whether the pet requires special care.
     */
    public OtherPet(String name, String owner, int age, String type, String petType, boolean needSpecialCare) {
        super(name, age, owner, type);
        this.petType = petType;
        this.needSpecialCare = needSpecialCare;
    }

    /**
     * Gets the specific type of the other pet.
     *
     * @return The specific type of the other pet.
     */
    public String getPetType() {
        return petType;
    }

    /**
     * Sets the specific type of the other pet.
     *
     * @param petType The specific type to set.
     */
    public void setPetType(String petType) {
        this.petType = petType;
    }


    @Override
    public boolean needSpecialHandle(Boolean need) {
        return true;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Pet type: " + getType());
        System.out.println("Need Special care: " + isNeedSpecialCare());
    }
}
