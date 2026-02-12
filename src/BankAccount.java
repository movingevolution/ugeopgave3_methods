import java.util.Locale;
import java.util.Scanner;

public class BankAccount {

    static String accountName = "Alex";
    static double balance = 0;

    public static void main(String[] args) {
        printBalance();
        depositAmount();
        printBalance();
    }

    public static void deposit100() {
        balance += 100;
    }

    public static void withdraw50() {
        balance -= 50;
    }

    public static void printBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void depositAmount() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Amount to be deposited: ");
        double amount = scanner.nextDouble();
        balance += amount;

    }

}
