public class Account {
    private int id;
    private Customer1 customer;
    private double balance = 0.0;
    public Account(int id, Customer1 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer1 customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer1 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer1 customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String toString() {
        return customer.toString() + " balance=$" + balance;
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
