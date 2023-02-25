package portfolio_project;

public interface queue_interface<T> {
    void enqueue(T element);
    T dequeue();
    boolean is_empty();
    void display();
}