package models;

import java.util.Date;

/**
 *
 * @author 30257320
 */
public class Zookeepers extends Person{
    
    //private attributes
    private String telNo;
    private boolean isRegistered;
    
    public String greeting(){
        String greeting = "<html>Welcome "+ this.getName()+"<br>You are logged in as a Zoo Keeper";
        return greeting;
    }
    
    //getters & setters
    public String getTelNo(){return telNo;}
    public void setTelNo(String telNoIn){telNo = telNoIn;}
    
    public boolean getIsRegistered(){return isRegistered;}
    public void setIsRegistered(boolean isRegisteredIn){isRegistered = isRegisteredIn;}
    
    //constructors
    public Zookeepers(){
        super();
        telNo = "";
        isRegistered = true;
    }
    
    public Zookeepers(String telNoIn, String emailIn, String nameIn, String passwordIn, Date dobIn){
        super(emailIn, nameIn, passwordIn, dobIn);
        telNo = telNoIn;
        isRegistered = true;
    }
    
    public Zookeepers(String telNoIn, boolean isRegisteredIn, String emailIn, String nameIn, String passwordIn, Date dobIn){
       super(emailIn, nameIn, passwordIn, dobIn);
       telNo = telNoIn;
       isRegistered = isRegisteredIn;
    }
}
