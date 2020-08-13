package com.thangnguyen.challenge;

public class Program {
    public static void main(String[] args) {
        Bank bank = new Bank("Test bank");
        bank.addBranch("branch 1");
        bank.addCustomer("branch 1", "customer 1", 100000);
        bank.addCustomer("branch 1", "customer 2", 110000);
        bank.addCustomer("branch 1", "customer 3", 120000);

        bank.addBranch("branch 2");
        bank.addCustomer("branch 2", "customer 1", 100000);
        bank.addCustomer("branch 2", "customer 2", 110000);
        bank.addCustomer("branch 2", "customer 3", 120000);

        bank.listCustomer("branch 2", true);

        if (!bank.addCustomer("branch 3", "customer 1", 100000)) {
            System.out.println("Branch 3 does not exist.");
        }

        if (!bank.addBranch("branch 1")) {
            System.out.println("Branch 1 already exists.");
        }
    }
}
