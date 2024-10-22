public class Invoice {
    private int id;
    private Customer customer;
    private Double amount;

    public Invoice(int id, Customer customer, Double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public int getCustomerId() {
        return customer.getId();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
        return customer.getDiscount() + amount;
    }
    public String toString() {
        return "Invoice [id=" + id + ", customer=" + customer + "(" + id + ")(" + customer.discount + "), amount=" + amount + "]";
    }
}
