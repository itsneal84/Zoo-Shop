package models;

/**
 *
 * @author 30257320
 */
public class Bird extends Animal {

    //private attributes
    private boolean canFly;

    public Bird(String name, String species, String age, String habitat, String cost, boolean b, char charGender, boolean canFly) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //getters and setters
    public boolean getCanFly() {
        return canFly;
    }
    
    public void setCanFly(boolean canFlyIn) {
        canFly = canFlyIn;
    }
    
    //default constructor
    public Bird(){
        super();
        canFly = true;
    }
    
    //constructor for all BUT animalId
    public Bird(String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn){
        super(nameIn, typeIn, ageIn, habitatIn, costIn, isAvailableIn, genderIn);
        canFly = canFlyIn;
    }
    
    //constructor for all
    public Bird(int animalIdIn, String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn){
        super(animalIdIn, nameIn, typeIn, ageIn, habitatIn, costIn, isAvailableIn, genderIn);
        canFly = canFlyIn;
    }
    
    
}
