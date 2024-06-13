import java.util.ArrayList;

public class CoffeeKiosk {

    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    public void addMenuItem(String name, double price) {
        Item item = new Item(name, price, this.menu.size());
        menu.add(item);

    }

    public void displayMenu() {
        for (Item item : menu) {
            System.out.println(item.getIndex() + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
       System.err.println("-----------------------------------------");
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        this.displayMenu();
        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        int index = 0;
        // Write a while loop to collect all user's order items
        while (!itemNumber.equals("q")) {
            index = Integer.parseInt(itemNumber);
            order.addItem(menu.get(index));
            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter anthore menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details
        order.display();
        orders.add(order);
    }

    public void addMenuItemByInput() {
        System.err.println("-----------------------------------------");
        System.out.println("Please enter new item name:");
        String name = System.console().readLine();
        
        String price ;

        while (!name.equals("q")) {
            System.out.println("Please enter (" + name + ") price:");
            price = System.console().readLine();
            addMenuItem(name, Double.parseDouble(price));
            System.out.println("Please enter new item name:");
            name = System.console().readLine();
            
        }
    }

    public void selectDisplay(){
        System.out.println("Welcome to out program :\n (q to exit):");
        System.out.println("0 New Order");
        System.out.println("1 New Item ");
        System.out.println("Please enter your chooes (q to exit): ");
        String type = System.console().readLine();

        while (!type.equals("q")) {
            try{
                switch (type) {
                    case "0":
                        newOrder();
                        break;
                    case "1": 
                        addMenuItemByInput();
                        break ; 
                    default:
                        System.out.println("Invalid input");
                        break;
                }
                System.err.println("-----------------------------------------");
                System.out.println("0 New Order");
                System.out.println("1 New Item ");
                System.out.println("Please enter your chooes (q to exit): ");
                type = System.console().readLine();

            }
            catch(Exception e){
                System.out.println("Error: error form your input !!!");
            }
        }

    }
}
