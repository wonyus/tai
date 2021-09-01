import java.util.*;

public class main {
    public static int pursesize;
    public static int amount;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter purse capacity");
        pursesize = scanner.nextInt();
        Purse purse = new Purse(pursesize); 
       
        System.out.println("Enter 1 for 1 bath\nEnter 5 for 5 bath\nEnter 10 for 10 bath");
        amount = scanner.nextInt();
        Coin onecoin = new Coin(amount);
        purse.insert(onecoin);
        
        System.out.println(purse.getbalance());
    }
}