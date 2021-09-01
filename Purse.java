import java.util.ArrayList;

public class Purse {
    private static int capacity;
    private static int one = 0;
    private static int five = 0;
    private static int ten = 0;
    private static Coin[] coins = new Coin[capacity];

    public Purse(int capacity) {
        this.capacity = capacity;
    }

    public static int count() {
        return (one + five + ten);
    }

    public static int getbalance() {
        return ((one * 1) + (five * 5) + (ten * 10));
    }

    public static int getCapacity() {
        return capacity;
    }

    public static Boolean isFull() {
        if (one + five + ten == capacity) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean insert(Coin amount) {
        int counter = 0;
        
        
        for (Coin rhean : coins) {
            System.out.println(amount.getValue());
            if (rhean == null && isFull() == false) {
                if (amount.getValue() == 1) {
                    coins[counter] = amount;
                    one += 1;
                    return true;
                } else if (amount.getValue() == 5) {
                    
                    coins[counter] = amount;
                    five += 1;
                    return true;
                } else if (amount.getValue() == 10) {
                    coins[counter] = amount;
                    ten += 1;
                    return true;
                }
            }

            counter += 1;
        }
        return false;

    }

    public static String withdraw(int amount) {
        int counter = 0;
        String[] arrwithdraw = {};

        /* check amount before next step to calculate*/ 

        if (amount > getbalance()) {
            return null;
        }else if ( amount % 5 < one){
            return null;
        }
        /* calculate withdraw */

        while (amount >= 0) {
            if (ten > 0 && amount >= 10) {
                arrwithdraw[counter] = "Coin(10)";
                ten -= 1;
                amount -= 10;
            } else if (five > 0 && amount >= 5) {
                arrwithdraw[counter] = "Coin(5)";
                five -= 1;
                amount -= 5;
            } else if (one > 0 && amount >= 1) {
                arrwithdraw[counter] = "Coin(1)";
                one -= 1;
                amount -= 1;
            }
            counter += 1;
        }

        /* format toString for withdraw output */

        String withdrawtostring = "";
        
        for (String temp : arrwithdraw){
            withdrawtostring += temp + " ";
        }
        String temp1 = withdrawtostring.join(" ", ",");
        withdrawtostring = "[" + temp1.substring(0, temp1.length()-1) + "]";
        return withdrawtostring;
    }

    public String toString() {
        return one + " 1-Baht, " + five + " 5-Baht, " + ten + " 10-Baht";
    }

}
