package models;

/**
 *
 * @author 30257320
 */
public class Orderline {

    //private attributes
    private int orderlineId;
    private Animal animal;
    private int quantity;
    private double lineTotal;
    
    //getters & setters
    public int getOrderlineId() { return orderlineId;}
    public void setOrderlineId(int orderlineIdIn) {orderlineId = orderlineIdIn;}

    public Animal getAnimal() {return animal;}
    public void setAnimal(Animal animalIn) {animal = animalIn;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantityIn) {quantity = quantityIn;}

    public double getLineTotal() {return lineTotal;}
    public void setLineTotal(double lineTotalIn) {lineTotal = lineTotalIn;    }
    
    //constructors
    //when making an order in the zooshop we will only ever order 1 animal
    public Orderline(int orderlineIdIn, Animal animalIn){
        orderlineId = orderlineIdIn;
        animal = animalIn;
        quantity = 1;
        lineTotal = animal.getCost();//this wont include quantity as it will only be 1
    }
    
    public Orderline(int orderlineIdIn, Animal animalIn, int quantityIn, double lineTotalIn){
        orderlineId = orderlineIdIn;
        animal = animalIn;
        quantity = quantityIn;
        lineTotal = lineTotalIn;        
    }
}