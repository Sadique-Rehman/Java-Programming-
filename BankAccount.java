class BankAccount {

    String accountHolderName;
    long accountNumber;
    String accountType;
    double accountBalance;

    BankAccount(String name, long accNo, String type, double balance) {
        accountHolderName = name;
        accountNumber = accNo;
        accountType = type;
        accountBalance = balance;
    }

    void deposit(double amount) {
        accountBalance = accountBalance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient Balance");
        } else {
            accountBalance = accountBalance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    void balanceEnquiry() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Rahul Sharma", 101, "Savings", 5000.0);
        BankAccount account2 = new BankAccount("Priya Singh", 102, "Current", 10000.0);

        System.out.println("---- Account 1 Details ----");
        account1.balanceEnquiry();
        account1.deposit(2000.0);
        account1.withdraw(3000.0);
        account1.withdraw(10000.0);
        account1.balanceEnquiry();

        System.out.println("\n---- Account 2 Details ----");
        account2.balanceEnquiry();
        account2.deposit(5000.0);
        account2.withdraw(2000.0);
        account2.balanceEnquiry();
    }
}