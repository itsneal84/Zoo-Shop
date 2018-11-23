package models;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author 30257320
 */
public class DBManager {
    //database access via jar imported to libraries
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://C:\\Users\\admin E5530\\OneDrive - City of Glasgow College\\HND\\Object Orientated Programming Java\\ZooShop_25_10\\ZooShop\\data\\ZooShopDB.accdb";
    
    public HashMap<String, Admin> loadAdmins() //String for key will be email address
    {
        HashMap<String, Admin> admins = new HashMap();
        
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Admins");
            
            while(rs.next()){
                String email = rs.getString("EmailAddress");
                String name = rs.getString("PersonName");
                String password = rs.getString("Password");
                Date dateOfBirth = rs.getDate("DateOfBirth");
                boolean superUser = rs.getBoolean("SuperUser");
                
                //boolean superUserIn, String emailIn, String nameIn, String passwordIn, Date dobIn
                Admin admin = new Admin (superUser, email, name, password, dateOfBirth);
                
                admins.put(email, admin);//adds admin0 to HashMap using email as key
            }
            conn.close();
            
        }
        catch(Exception ex){
            String message = ex.getMessage();
        }
        finally{
            return admins;
        }
    }//end loadAdmins
    
    public Admin AdminLogin(String email, String password){
        HashMap<String, Admin> admins = loadAdmins();
        if(admins.containsKey(email)){
            Admin foundAdmin = admins.get(email);
            
            if(foundAdmin.getPassword().equals(password)){
                return foundAdmin;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }//end adminLogin
    
    public HashMap<String, Zookeepers> loadZookeepers() //String for key will be email address
    {
        HashMap<String, Zookeepers> zooKeepers = new HashMap();
        
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Zookeepers");
            
            while(rs.next()){
                String email = rs.getString("EmailAddress");
                String name = rs.getString("PersonName");
                String password = rs.getString("Password");
                Date dateOfBirth = rs.getDate("DateOfBirth");
                String tel = rs.getString("TelephoneNo");
                
                //String telNoIn, String emailIn, String nameIn, String passwordIn, Date dobIn
                Zookeepers zooKeeper = new Zookeepers (tel, email, name, password, dateOfBirth);
                
                zooKeepers.put(email, zooKeeper);//adds zookeeper to HashMap using email as key
            }
            conn.close();
            
        }
        catch(Exception ex){
            String message = ex.getMessage();
        }
        finally{
            return zooKeepers;
        }
    }//end loadZookeepers
    
    public Zookeepers zooKeeperLogin(String email, String password){
        HashMap<String, Zookeepers> zooKeepers = loadZookeepers();
        if(zooKeepers.containsKey(email)){
            Zookeepers foundKeeper = zooKeepers.get(email);
            
            if(foundKeeper.getPassword().equals(password)){
                return foundKeeper;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }//end zooKeeperlogin
    
    public HashMap<Integer, Animal> loadAnimals() //String for key will be animalid
    {
        HashMap<Integer, Animal> animals = new HashMap();
        
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Animals");
            
            while(rs.next()){
                int animalId = rs.getInt("AnimalID");
                String name = rs.getString("AnimalName");
                String type = rs.getString("Type");
                int age = rs.getInt("Age");
                String waterType = rs.getString("WaterType");
                double cost = rs.getDouble("Cost");
                boolean isAvailable = rs.getBoolean("Availability");
                char gender = rs.getString("Gender").charAt(0);
                boolean canFly = rs.getBoolean("CanFly");
                String habitat = rs.getString("Location");
                
                if (waterType!= null){
                    //make fish
                    //int animalIdIn, String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, String waterTypeIn
                    Fish fish = new Fish(animalId, name, type, age, habitat, cost, isAvailable, gender, waterType);
                    
                    animals.put(animalId, fish);//adds fish0 to HashMap using animalId as key
                }
                else{
                    //make bird
                    //int animalIdIn, String nameIn, String typeIn, int ageIn, String habitatIn, double costIn, boolean isAvailableIn, char genderIn, boolean canFlyIn
                    Bird bird = new Bird(animalId, name, type, age, habitat, cost, isAvailable, gender, canFly);
                    
                    animals.put(animalId, bird);//adds bird0 to HashMap using animalId as key
                }
            }
            conn.close();
            
        }
        catch(Exception ex){
            String message = ex.getMessage();
        }
        finally{
            return animals;
        }
    }//end loadAnimals
    
    public boolean registerZookeeper(Zookeepers zooKeeper){
        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO ZooKeepers (EmailAddress, PersonName, Password, DateOfBirth, TelephoneNo)" + "VALUES ('"+ zooKeeper.getEmail() + "', '"
                    + zooKeeper.getName() + "', '" + zooKeeper.getPassword() + "', '" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(zooKeeper.getDob()) + "', '"
                    + zooKeeper.getTelNo() + "')");
                        
            conn.close();
            return true;
            
        }
        catch(Exception ex){
            String message = ex.getMessage();
            return false;
        }
    }//end registerZookeeper
    
    public void addAnimal(Animal animal){
        
        String canFly = "false";
        String waterType = "";
        
        if(animal.getClass().getName().equals("models.Bird")){
            //cast as bird, save as bird
            Bird bird = (Bird)animal;
            
            canFly = String.valueOf(bird.getCanFly());
        }
        else{
            //cast as fish
            Fish fish = (Fish)animal;
            
            waterType = fish.getWaterType();
        }

        try{
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO Animals (AnimalName, Gender, Type, Age, Location, WaterType, CanFly, Availability, Cost)" + "VALUES ('"+ animal.getName()+ "', '"
                    + animal.getGender()+ "', '" + animal.getType()+ "', '" + animal.getAge() + "', '" + animal.getHabitat()  + "', '" + animal.isIsAvailable() + "', '"
                    + waterType + "', '" + canFly + "', '" + animal.getCost() + "')");
                        
            conn.close();
            
        }
        catch(Exception ex){
            String message = ex.getMessage();
        }
    }//end addAnimal
}
