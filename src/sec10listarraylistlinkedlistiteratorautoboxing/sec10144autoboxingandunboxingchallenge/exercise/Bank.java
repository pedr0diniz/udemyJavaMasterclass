package sec10listarraylistlinkedlistiteratorautoboxing.sec10144autoboxingandunboxingchallenge.exercise;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        return branch.newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        return branch.addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean shouldPrintTransactions) {
        Branch branch = findBranch(branchName);

        if (branch == null) {
            return false;
        }

        System.out.println("Customer details for branch " + branch.getName());

        List<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            System.out.printf("Customer: %s[%d]%n", customers.get(i).getName(), i+1);
            if (shouldPrintTransactions) {
                System.out.println("Transactions");

                List<Double> transactions = customers.get(i).getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.printf("[%d] Amount %.2f%n", j+1, transactions.get(j));
                }
            }
        }

        return true;
    }

    private Branch findBranch(String branchName) {
        for (Branch branch : branches) {
            if (branch.getName().equalsIgnoreCase(branchName)) {
                return branch;
            }
        }

        return null;
    }
}
