package portfolio_project;
import java.util.LinkedList;
import java.util.Comparator;

public class quicksort {

    public static void quick_sort(LinkedList<customer> customers, Comparator<customer> comp) {
        quick_sort(customers, 0, customers.size() - 1, comp);
    }

    private static void quick_sort(LinkedList<customer> customers, int low, int high, Comparator<customer> comp) {
        if (low < high) {
            int pivotIndex = partition(customers, low, high, comp);
            quick_sort(customers, low, pivotIndex - 1, comp);
            quick_sort(customers, pivotIndex + 1, high, comp);
        }
    }

    private static int partition(LinkedList<customer> customers, int low, int high, Comparator<customer> comp) {
        customer pivot = customers.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comp.compare(customers.get(j), pivot) < 0) {
                i++;
                swap(customers, i, j);
            }
        }
        swap(customers, i + 1, high);
        return i + 1;
    }

    private static void swap(LinkedList<customer> customers, int i, int j) {
        customer temp = customers.get(i);
        customers.set(i, customers.get(j));
        customers.set(j, temp);
    }

    // Comparator to sort by name
    public static Comparator<customer> sort_name = new Comparator<customer>() {
        @Override
        public int compare(customer c1, customer c2) {
            return c2.get_name().compareTo(c1.get_name());
        }
    };

    // Comparator to sort by order number
    public static Comparator<customer> sort_order_number = new Comparator<customer>() {
        @Override
        public int compare(customer c1, customer c2) {
            return c2.get_order_number().compareTo(c1.get_order_number());
        }
    };
}

