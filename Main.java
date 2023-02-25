package portfolio_project;
import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {

        // initialize variables
        Scanner input = new Scanner(System.in);
        order<customer> queue = new order<>();
        display arrays = new display();

        // display menu
        System.out.println("\nMENU");
        System.out.println("0 -- Exit");
        System.out.println("1 -- Add a customer to the queue");
        System.out.println("2 -- Remove a customer from the queue");
        System.out.println("3 -- Display the queue\n");

        // get user input
        System.out.print("Enter a number from the menu: ");
        int option = input.nextInt();
    
        // main program loop 
        while (option != 0) {
            
            switch (option) {

                case 1:

                    // get customer information
                    System.out.print("Customer last name: ");
                    String name = input.next();
                    System.out.print("Customer order number: ");
                    int order_number = input.nextInt();
                    System.out.print("Customer total cost: ");
                    double total_cost = input.nextDouble();

                    // add input to customer object
                    customer customer = new customer(name, order_number, total_cost);

                    // add customer to queue
                    queue.enqueue(customer);

                    // copy customer to arrays
                    arrays.add_customer(customer);

                    // Message display
                    System.out.println("Customer added to queue.");

                    // sort arrays
                    arrays.sort();

                    // display arrays
                    arrays.display_order();

                    break;

                case 2:

                    // remove customer from queue
                    customer removed = queue.dequeue();
                    // remove customer from arrays
                    arrays.remove_customer(removed);

                    System.out.println("Queued customer removed.\n");

                    break;

                case 3:

                    // display queue
                    System.out.println("\tQueue:");
                    queue.display();
                    System.out.println();
                    
                    break;

                default:

                    // catch a default as invalid option
                    System.out.println("Invalid option. Please try again.\n");

                    break;
            }

            // continue loop and get user input
            System.out.print("Enter a number from the menu: ");
            option = input.nextInt();

        }

        // exit program
        System.out.println("Exiting program...");
        input.close();

    }

}