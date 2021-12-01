import java.util.*;

class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;

        for (int i = 0; i <= numWeeks; i++) {
            sum += i;
        }
        
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for(String item : menuItems) {
            System.out.println(menuItems.indexOf(item) + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName +"!");
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
        System.out.println(customers);
    }

}