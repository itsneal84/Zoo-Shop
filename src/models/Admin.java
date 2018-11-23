package models;

import java.util.Date;

/**
 *
 * @author 30257320
 */
public class Admin extends Person {
    
    private boolean superUser;
    
    public String greeting(){
        String greeting = "<html>Welcome "+ this.getName()+"<br>You ";
        if(superUser){
            greeting = greeting + "are logged in as a Super User";
        }
        else{
            greeting = greeting + "are not logged in as a Super User";
        }
        return greeting;
    }
    
    //getters & setters
    public boolean getSuperUser(){return superUser;}
    public void setSuperUser(boolean superUserIn){superUser = superUserIn;}
    
    //constructor
    public Admin(){
        super();
        superUser = true;
    }
    
    public Admin(boolean superUserIn, String emailIn, String nameIn, String passwordIn, Date dobIn){
        super(emailIn, nameIn, passwordIn, dobIn);
        superUser = superUserIn;
    }
}
