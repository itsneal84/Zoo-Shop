package models;

/**
 *
 * @author 30257320
 */
public class Fish extends Animal {

    //private attributes
    private String waterType;
    
    //getters and setters
    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterTypeIn) {
        waterType = waterTypeIn;
    }
    
    //default constructor
    public Fish(){
        super();
        waterType = "salt";
    }
    
    //constructor for all BUT animalId
    public Fish(String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, String waterTypeIn){
        super(nameIn, typeIn, ageIn, habitatIn, costIn, isAvailableIn, genderIn);
        waterType = waterTypeIn;
    }
    
    //constructor for all
    public Fish(int animalIdIn, String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, String waterTypeIn){
        super(animalIdIn, nameIn, typeIn, ageIn, habitatIn, costIn, isAvailableIn, genderIn);
        waterType = waterTypeIn;
    }
}
