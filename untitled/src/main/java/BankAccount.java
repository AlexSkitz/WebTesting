import java.time.LocalDateTime;

public class BankAccount {
    private final String cardHolderName;
    private final int accountNumber = (int) (5375 + Math.random() * 1000000000);
    private int currentBalance;
    private final LocalDateTime cardCreateDate = LocalDateTime.now();

    public BankAccount(String cardHolderName, int currentBalance) {
        this.cardHolderName = cardHolderName;
        this.currentBalance = currentBalance;
    }

    public void addMoney(int amount) {
        this.currentBalance += amount;
        System.out.println("You add " + amount + "cash. Your current balance is " + currentBalance);
    }

    public void getMoney(int amount) {
        if (amount < currentBalance) {
            this.currentBalance -= amount;
            System.out.println("You withdraw " + amount + " cash. Your current balance is " + currentBalance);
        } else {
            System.out.println("Not enough balance on your bank account to withdraw. Your current balance " +
                    "is " + currentBalance);
        }
    }

    public void transferMoney(BankAccount accountWhoSend, BankAccount accountToSend, int amount) {
        if (amount < accountWhoSend.currentBalance) {
            accountWhoSend.currentBalance -= amount;
            accountToSend.currentBalance += amount;
            System.out.println("You send " + amount + " of cash to " + accountToSend.cardHolderName + ". Your current " +
                    "balance is " + currentBalance);
        } else {
            System.out.println("Not enough money on your bank account to send. Your current balance " +
                    "is " + currentBalance);
        }
    }

    public void getAccountInfo() {
        System.out.println("Cardholder name is: " + this.cardHolderName);
        System.out.println("Account number is: " + this.accountNumber);
        System.out.println("Current balance is: " + this.currentBalance);
        System.out.println("Account created at: " + this.cardCreateDate);
    }
}
