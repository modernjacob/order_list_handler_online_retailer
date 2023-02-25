package portfolio_project;

public class customer {
    
    protected String name;
    protected Integer order_number;
    protected double total_cost;

    protected customer(String name, int order_number, double total_cost) {
        this.name = name;
        this.order_number = order_number;
        this.total_cost = total_cost;
    }

    //get name
    public String get_name() {
        return name;
    }

    //get order number
    public Integer get_order_number() {
        return order_number;
    }

    //get total cost
    public double get_total_cost() {
        return total_cost;
    }

    public void print() {
        System.out.println("\tCustomer: " + name + "\tOrder Number: " + order_number + "\tTotal Cost: $" + total_cost);
    }

}