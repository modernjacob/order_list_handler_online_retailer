package portfolio_project;
import java.util.LinkedList;

public class order<T> implements queue_interface<customer>  {

    private LinkedList<customer> elements = new LinkedList<>();

    @Override
    public void enqueue(customer element) {
        elements.addLast(element);
    }

    @Override
    public customer dequeue() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("The Queue is empty.");
        }
        return elements.removeFirst();
    }

    @Override
    public boolean is_empty() {
        return elements.isEmpty();
    }

    @Override
    public void display() {
        for (customer element : elements) {
            element.print();
        }
    }

}

