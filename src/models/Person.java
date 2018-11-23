package models;

import java.util.Date;

/**
 *
 * @author 30257320
 */
public class Person {
    
    //private attributes
    private String email;
    private String name;
    private String password;
    private Date dob;
    
    //getters & setter methods
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String emailIn){
        email = emailIn;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String nameIn){
        name = nameIn;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String passwordIn){
        password = passwordIn;
    }
    
    public Date getDob(){
        return dob;
    }
    
    public void setDob(Date dobIn){
        dob = dobIn;
    }
    
    //constructors
    //zero constructor
    public Person(){
        name = "Bob";
        email = "bob@bobson.com";
        password = "qwertyuiop";
        dob = new Date();
    }
    
    //overloaded constructor
    public Person(String emailIn, String nameIn, String passwordIn, Date dobIn){
        email = emailIn;
        name = nameIn;
        password = passwordIn;
        dob = dobIn;
    }
}
