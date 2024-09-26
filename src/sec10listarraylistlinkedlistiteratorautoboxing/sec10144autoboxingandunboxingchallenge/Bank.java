package sec10listarraylistlinkedlistiteratorautoboxing.sec10144autoboxingandunboxingchallenge;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public boolean addCustomer(String name) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name));
            return true;
        }

        return false;
    }

    public boolean addTransaction(String name, double value) {
        Customer customer = findCustomer(name);

        if (customer == null) {
            return false;
        }

        customer.addTransaction(value);

        return true;
    }

    public void printStatement(String customerName) {
        Customer customer = findCustomer(customerName);

        if (customer != null) {
            System.out.printf("Customer Name: %s%n", customer.getName());

            for (double transaction : customer.getTransactions()) {
                System.out.printf(
                        "%10s transaction of value $%10.2f%n",
                        transaction > 0.0 ? "Deposit" : "Withdrawal",
                        transaction
                );
            }
        }
    }

    private Customer findCustomer(String name) {
        List<Customer> searchResult = customers.stream().filter(it -> it.getName().equalsIgnoreCase(name)).toList();
        if (searchResult.isEmpty()) {
            return null;
        }

        return searchResult.get(0);
    }
}
