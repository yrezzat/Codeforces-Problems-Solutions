package Problems;

import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int coin = scanner.nextInt();
        int counter = 1;

        while (true) {
            if ((counter * price) % 10 == 0 || (counter * price - coin) % 10 == 0) {
                break;
            } else counter++;
        }

        System.out.println(counter);
    }
}
