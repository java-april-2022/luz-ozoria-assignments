package BaristaChallenge;
import java.util.ArrayList;

public class Order {

    // Private Member Variables
    private String name; // Changed from public to private 
    // Removing total member variable 
    private boolean ready;// Changed from public to private 

    private ArrayList<Item>items; 

    // Constructor
    public Order() { // Adding a constructor that takes no arguments
        this.name = "Guest"; // sets name to "Guest"
        this.items = new ArrayList<Item>(); // initializes items array to an empty array ArrayList<Item>
        this.ready = false;
    }

    // Overloaded Constructor
    public Order(String name){ // adding an overloaded constructor that takes String name as an argument
        this.name = name; // to create an instance with a name
        this.ready = false;
    }

    // Accessors & Mutators (Getters and Setters) 
    // Create getters and setters for all the member variables (name, items, ready)
    public String getName(){
        return this.name;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setItem(ArrayList<Item> items) {
        this.items = items;
    }

    public void setReady(boolean ready){
        this.ready = ready;
    }

    // Order Class Methods
    // addItem
    public void addItem(Item item){
        this.items.add(item);
    }

    // getStatusMessage
    public String getStatusMessage() {
        if (this.ready == true) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon!";
        }
    }
    
    // getOrderTotal 
    public double getOrderTotal(){
        double total = 0;
        for (Item item : this.items){
            total += item.getPrice();
        }
        return total;
    }

    // display 
    public void display() {
        System.out.printf("Customer Name: %s", this.name + " ");
        for (Item item : this.items) {
            System.out.println(item.getName() + "- $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());

    }
}