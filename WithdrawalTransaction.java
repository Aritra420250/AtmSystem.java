class WithdrawalTransaction extends ATMTransaction {
    double amount;

    public WithdrawalTransaction(String id, String date, String type, double amount) {
        super(id, date, type);
        this.amount = amount;
    }

    boolean withdrawal(Account account) {
        return account.withdraw(amount);
    }
}

class TransferTransaction extends ATMTransaction {
    double amount;
    Account targetAccount;

    public TransferTransaction(String id, String date, String type, double amount, Account targetAccount) {
        super(id, date, type);
        this.amount = amount;
        this.targetAccount = targetAccount;
    }

    void transfer(Account sourceAccount) {
        if (sourceAccount.withdraw(amount)) {
            targetAccount.deposit(amount);
            System.out.println("Transferred " + amount + " to " + targetAccount.owner.name);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
