import java.util.*;

public class main {

    // create a scanner and Purse object
    static Scanner scanner;
    static Purse wallet;

    // create instant pursesize, pursesize, choice
    private static int pursesize;
    private static int amount;
    private static int choice;

    // run program
    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        // set size Purse
        System.out.println("Enter purse capacity");
        pursesize = scanner.nextInt();
        wallet = new Purse(pursesize);

        // output choice to users
        System.out.println("Enter this choice\n" + "1 deposit.\n" + "2 withdraw.\n" + "3 isfull.\n"
                + "4 check capacity.\n" + "5 check balance.\n" + "6 check count.\n" + "0 for exit");
        choice = scanner.nextInt();

        // check function for this program
        while (choice != 0) {

            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                isfull();
            } else if (choice == 4) {
                check_capacity();
            } else if (choice == 5) {
                check_balance();
            } else if (choice == 6) {
                check_count();
            }

            // output choice to users agains
            System.out.println("Enter this choice\n" + "1 deposit.\n" + "2 withdraw.\n" + "3 isfull.\n"
                    + "4 check capacity.\n" + "5 check balance.\n" + "6 check count.\n" + "0 for exit");
            choice = scanner.nextInt();

        }

    }

    // function insert coin
    public static void deposit() {
        System.out.println("Enter money to deposit");
        amount = scanner.nextInt();

        // check coin 1, 5, 10
        if (amount == 1 || amount == 5 || amount == 10) {
            Coin onecoin = new Coin(amount);
            System.out.println(wallet.insert(onecoin));
        } else {
            System.out.println("We don't accept " + amount + "-Baht coins");
        }

    }

    // function withdraw coin
    public static void withdraw() {
        System.out.println("Enter how many withdraw?");
        amount = scanner.nextInt();
        System.out.println(wallet.withdraw(amount));
    }

    // check free size for Purse
    public static void isfull() {
        System.out.println(wallet.isFull());
    }

    // function check capacity for Purse
    public static void check_capacity() {
        System.out.println("You equal to " + wallet.getCapacity());
    }

    // function check balance for Purse
    public static void check_balance() {
        System.out.println("You have " + wallet.getbalance() + " bath");
    }

    // check how many coins in purse
    public static void check_count() {
        System.out.println("You have " + wallet.count() + " coins");
    }
}