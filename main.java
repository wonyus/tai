import java.util.*;

public class main {
    Scanner scanner;
    Purse purse;

    public int pursesize;
    public int amount;
    public String choice;

    public void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Enter purse capacity");
        pursesize = scanner.nextInt();
        purse = new Purse(pursesize);

        choice = "";

        while (choice != "q") {
            System.out.println("Enter this choice\n" + "1 deposit.\n " + " 2 withdraw.\n " + " 3 isfull.\n " + " 4 check capacity.\n "
                    + " 5 check balance.\n" + " 6 check count.");
            choice = scanner.nextLine();
        }

    }

    public void choins(String choice) {

        if (choice == "1") {
            deposit();
        } else if (choice == "2") {
            withdraw();
        } else if (choice == "2") {
            isfull();
        } else if (choice == "3") {
            check_capacity();
        } else if (choice == "4") {
            check_balance();
        } else if (choice == "5") {
            check_count();
        }
    }

    public void deposit() {
        System.out.println("Enter 1 for 1 bath\n" + "Enter 5 for 5 bath\n" + "Enter 10 for 10 bath");
        amount = scanner.nextInt();
        Coin onecoin = new Coin(amount);
        purse.insert(onecoin);
    }

    public void withdraw() {

    }

    public void isfull() {
        purse.isFull()
    }

    public void check_capacity() {
        System.out.println(purse.getCapacity());
    }

    public void check_balance() {

    }

    public void check_count() {

    }
}