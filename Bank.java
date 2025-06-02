import java.util.*;

class Bank {
    String code;
    String address;

    public Bank(String code, String address) {
        this.code = code;
        this.address = address;
    }

    void manages() {
        System.out.println("Bank manages ATM services.");
    }

    void maintains() {
        System.out.println("Bank maintains customer accounts.");
    }
}

class Customer {
    String name;
    String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void owns() {
        System.out.println(name + " owns one or more accounts.");
    }
}

class Account {
    String type;
    Customer owner;
    double balance;

    public Account(String type, Customer owner, double balance) {
        this.type = type;
        this.owner = owner;
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
