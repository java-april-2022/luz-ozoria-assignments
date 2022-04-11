import java.util.ArrayList;

public class CafeUtil {
    // reward system that tracks 
    public int getStreakGoal(int numWeeks) { // Ninja Bonus: add parameter numWeeks so admin can change streak goal from 10 to any # they want 
        int sum = 0; 
        for (int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    // sum all prices in the array and return total 

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for ( int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    // print out each index and menu item 

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i < menuItems.size(); i++){
            String name = menuItems.get(i);
            System.out.println(i + name);
        }
    }

    // adding a customer 
    public void addCustomer(ArrayList<String> customers){
        System.out.print("Please enter your name:"); // 1. request name from customer
        String userName = System.console().readLine(); // 2. add line to get user input 
        System.out.println("Hello," + userName + "!"); // 3. print customer greeting
        System.out.printf("There are %s people in front of you", customers.size()); // 4. inform customer of position in queue
        customers.add(userName); // 5. add customer's name to list of customers 
        System.out.println(customers); // 5. print customer list 
    }

}
