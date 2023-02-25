package portfolio_project;
import java.util.*;

public class display {

    protected LinkedList<customer> array_name = new LinkedList<>();
    protected LinkedList<customer> array_number = new LinkedList<>();

    public void add_customer(customer customer) {
        array_name.add(customer);
        array_number.add(customer);
    }

    public void remove_customer(customer customer) {
        array_name.remove(customer);
        array_number.remove(customer);
    }

    public void sort() {
        quicksort.quick_sort(array_name, quicksort.sort_name);
        quicksort.quick_sort(array_number, quicksort.sort_order_number);
    }

    public void display_order() {
        System.out.println("\nCustomer Data | Sort: Name (descending)");
        for (customer customer : array_name) {
            customer.print();
        }

        System.out.println("\nCustomer Data | Sort: Order Number (descending)");
        for (customer customer : array_number) {
            customer.print();
        }
        System.out.println();
    }
}

