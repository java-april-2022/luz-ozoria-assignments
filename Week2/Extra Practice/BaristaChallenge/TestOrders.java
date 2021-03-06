package BaristaChallenge;
import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Item item1 = new Item("Almond Mocha", 2.25);
        Item item2 = new Item("Soy Latte", 2.50);
        Item item3 = new Item("Drip Coffee", 1.75);
        Item item4 = new Item("Cashew Cappuccino", 2.75);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Mylo"); 
        Order order4 = new Order("Ruby"); 
        Order order5 = new Order("Nina");

        // Add at least 2 items to each of the orders using the addItem method you wrote, 
        // for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: 
        // order3.addItem(item1);
        order1.addItem(item4);
        order1.addItem(item3);

        order2.addItem(item3);
        order2.addItem(item2);

        order3.addItem(item2);
        order3.addItem(item1);

        order4.addItem(item1);
        order4.addItem(item4);

        order5.addItem(item2);
        order5.addItem(item3);

        // Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. 
        // For example: order2.setReady(true); System.out.println(order2.getStatusMessage());

        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        order5.setReady(true);
        System.out.println(order5.getStatusMessage());

        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        // Finally, call the display method on all of your orders, like so: order3.display();
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}
