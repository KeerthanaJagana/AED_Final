/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nayankarumuri
 */
public class PSH_Restaurant_orders {
    private String id;
    private String status;
    private String details;
    private String feedback;
    private PSH_Customer customer;
    private PSH_EnterCatag_Restaurant restaurant;
    private PSH_DeliveryAgent deliveryAgent;

    public PSH_Restaurant_orders(String details) {
//        id = UUID.randomUUID().toString();
        this.details = details;
    }
      public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PSH_EnterCatag_Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(PSH_EnterCatag_Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public PSH_DeliveryAgent getDeliveryAgent() {
        return deliveryAgent;
    }

    public void setDeliveryAgent(PSH_DeliveryAgent deliveryAgent) {
        this.deliveryAgent = deliveryAgent;
    }

    

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PSH_Customer getCustomer() {
        return customer;
    }

    public void setCustomer(PSH_Customer customer) {
        this.customer = customer;
    }

    

    public String toString() {
        return details;
    }
}
