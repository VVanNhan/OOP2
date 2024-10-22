public class OOP25 {
    public static void main(String[] args) {
        Customer1 customer1 = new Customer1(101, "Nhan", 'm');
        System.out.println(customer1);
        Account account1 = new Account(1001, customer1, 500.0);
        Account account2 = new Account(1002, customer1);
        System.out.println(account1);
        System.out.println(account2);
        account1.deposit(200.0);
        System.out.println(account1);
        account1.withdraw(100.0);
        System.out.println(account1);
        account1.withdraw(1000.0);
        System.out.println("Customer name: " + account1.getCustomerName());
    }
}
