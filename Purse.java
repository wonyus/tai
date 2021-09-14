import java.util.ArrayList;

public class Purse {
    private static int capacity;
    private static int one = 0;
    private static int five = 0;
    private static int ten = 0;
    private static ArrayList<Coin> coins = new ArrayList<Coin>();

    // set size purse
    public Purse(int capacity) {
        this.capacity = capacity;
    }

    // return count of coins
    public static int count() {
        return (one + five + ten);
    }

    // return balance in purse
    public static int getbalance() {
        return ((one * 1) + (five * 5) + (ten * 10));
    }

    // return capacity of purse
    public static int getCapacity() {
        return capacity;
    }

    // check free size in purse
    public static Boolean isFull() {
        if (one + five + ten == capacity) {
            return true;
        } else {
            return false;
        }
    }

    // insert coin function
    public static Boolean insert(Coin amount) {

        if (isFull() == false) {
            if (amount.getValue() == 1) {
                coins.add(amount);
                one += 1;
                return true;
            } else if (amount.getValue() == 5) {
                coins.add(amount);
                five += 1;
                return true;
            } else if (amount.getValue() == 10) {
                coins.add(amount);
                ten += 1;
                return true;
            }

        }
        return false;

    }

    // withdraw function
    public static String withdraw(int amount) {
        ArrayList<String> arrwithdraw = new ArrayList<String>();

        /* check amount before next step to calculate */

        if (amount > getbalance()) {
            return null;
        } else if (amount % 5 > one) {
            return null;
        }

        // algorithm use withdraw
        while (amount > 0) {

            /* calculate withdraw */
            if (ten > 0 && amount >= 10) {
                search_remove(10);
                arrwithdraw.add("Coin(10)");
                ten -= 1;
                amount -= 10;
            } else if (five > 0 && amount >= 5) {
                search_remove(5);
                arrwithdraw.add("Coin(5)");
                five -= 1;
                amount -= 5;
            } else if (one > 0 && amount >= 1) {
                search_remove(1);
                arrwithdraw.add("Coin(1)");
                one -= 1;
                amount -= 1;
            }

        }

        return arrwithdraw.toString() + "\n";
    }

    // remove coin in array coins
    public static void search_remove(int number) {
        int counter = 0;
        for (Coin temp : coins) {
            if (number == temp.getValue()) {
                coins.remove(counter);
                counter = 0;
                break;
            }
            counter++;
        }
    }

    // return string for request
    public String toString() {
        return one + " 1-Baht, " + five + " 5-Baht, " + ten + " 10-Baht";
    }

}
