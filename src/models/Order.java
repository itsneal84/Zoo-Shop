package models;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author 30257320
 */
public class Order {

    private int orderId;
    private Date orderDate;
    private Zookeepers zookeeper;
    private double orderTotal;
    private String status;
    private HashMap<Integer, Orderline> orderline;
    
    //getters & setters
    public int getOrderId() {return orderId;}
    public void setOrderId(int orderIdIn) {orderId = orderIdIn;}

    public Date getOrderDate() {return orderDate;}
    public void setOrderDate(Date orderDateIn) {orderDate = orderDateIn;}

    public Zookeepers getZookeeper() {return zookeeper;}
    public void setZookeeper(Zookeepers zookeeperIn) {zookeeper = zookeeperIn;}

    public double getOrderTotal() {return orderTotal;}
    public void setOrderTotal(double orderTotalIn) {orderTotal = orderTotalIn;}

    public String getStatus() {return status;}
    public void setStatus(String statusIn) {status = statusIn;
    }

    public HashMap<Integer, Orderline> getOrderline() {return orderline;}
    public void setOrderline(HashMap<Integer, Orderline> orderlineIn) {orderline = orderlineIn;
    }
    
    //constructors
    public Order(Zookeepers zookeeperIn){
        orderId = 0;
        orderDate = new Date();
        zookeeper = zookeeperIn;
        orderTotal = 0;
        status = "";
        orderline = new HashMap();
    }
    
    public Order(int orderIdIn, Date orderDateIn, Zookeepers zookeeperIn, double orderTotalIn, String statusIn){
        orderId = orderIdIn;
        orderDate = orderDateIn;
        zookeeper = zookeeperIn;
        orderTotal = orderTotalIn;
        status = statusIn;
        orderline = new HashMap();
    }
    
    
    
}
