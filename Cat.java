package Veterinarian;

/**
 * Class: Cat
 * @author Duc Trung Dao
 * @version 1.0
 * Course: ITEC 3150 Spring 2024
 * Written: Jan 15, 2024
 *
 * This class represents a cat, extending the Pet class.
 * It includes additional attributes specific to cats such as hair type, nail type, and color.
 */

public class Cat extends Pet {
    // Additional attributes for the Cat class
    private String hairType;
    private String nailType;
    private String color;

    /**
     * Constructs a Cat object with the specified attributes.
     *
     * @param name     The name of the cat.
     * @param age      The age of the cat.
     * @param owner    The owner's name of the cat.
     * @param type     The type of the pet.
     * @param hairType The type of hair (long or short) the cat has.
     * @param nailType The type of nails (clawed or declawed) the cat has.
     * @param color    The color of the cat's fur.
     */

    public Cat(String name, String owner, int age, String type, String hairType, String nailType, String color) {
        super(name, age, owner, type);
        this.hairType = hairType;
        this.nailType = nailType;
        this.color = color;
    }

    /**
     * Gets the hair type of the cat.
     *
     * @return The hair type of the cat.
     */
    public String getHairType() {
        return hairType;
    }

    /**
     * Sets the hair type of the cat.
     *
     * @param hairType The hair type to set.
     */
    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    /**
     * Gets the nail type of the cat.
     *
     * @return The nail type of the cat.
     */
    public String getNailType() {
        return nailType;
    }

    /**
     * Sets the nail type of the cat.
     *
     * @param nailType The nail type to set.
     */
    public void setNailType(String nailType) {
        this.nailType = nailType;
    }

    /**
     * Gets the color of the cat's fur.
     *
     * @return The color of the cat's fur.
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the cat's fur.
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
        System.out.println("Hair type: " + getHairType());
        System.out.println("Nail Style: " + getNailType());
        System.out.println("Color: " + getColor());
    }
}



