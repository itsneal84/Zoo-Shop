package models;

/**
 *
 * @author 30257320
 */
public class Animal {
    
    //private attributes
    private int animalId;
    private String name;
    private String type;
    private int age;
    private String habitat;
    private double cost;
    private boolean isAvailable;
    private char gender;
    
    @Override
    public String toString(){
        String output = name + " the " +type;
        return output;
    }
    
    //getters & setter methods
    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalIdIn) {
        animalId = animalIdIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameIn) {
        name = nameIn;
    }

    public String getType() {
        return type;
    }

    public void setType(String typeIn) {
        type = typeIn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageIn) {
        age = ageIn;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitatIn) {
        habitat = habitatIn;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double costIn) {
        cost = costIn;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailableIn) {
        isAvailable = isAvailableIn;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char genderIn) {
        gender = genderIn;
    }
    
    //zero default constructor
    public Animal(){
        animalId = 0;
        name = "";
        type = "";
        age = 0;
        habitat = "";
        cost = 0.0;
        isAvailable = true;
        gender = ' ';
    }
    
    //constructor for all but animalId
    public Animal(String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn){
        animalId = 0;
        name = nameIn;
        type = typeIn;
        age = ageIn;
        habitat = habitatIn;
        cost = costIn;
        isAvailable = isAvailableIn;
        gender = genderIn;
    }
    
    public Animal(int animalIdIn, String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn){
        animalId = animalIdIn;
        name = nameIn;
        type = typeIn;
        age = ageIn;
        habitat = habitatIn;
        cost = costIn;
        isAvailable = isAvailableIn;
        gender = genderIn;
    }
}
