class DebitCard {
    String cardNo;
    Customer ownedBy;

    public DebitCard(String cardNo, Customer ownedBy) {
        this.cardNo = cardNo;
        this.ownedBy = ownedBy;
    }

    void access() {
        System.out.println("Accessing ATM using card: " + cardNo);
    }
}

class ATM {
    String location;
    Bank managedBy;

    public ATM(String location, Bank managedBy) {
        this.location = location;
        this.managedBy = managedBy;
    }

    void identifies() {
        System.out.println("ATM located at " + location);
    }

    void transactions() {
        System.out.println("ATM handles transactions.");
    }
}

class ATMTransaction {
    String transactionId;
    String date;
    String type;

    public ATMTransaction(String transactionId, String date, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
    }

    void update() {
        System.out.println("Transaction updated: " + transactionId);
    }
}
