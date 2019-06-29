package Problems;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Y=scanner.nextInt();
        int W=scanner.nextInt();
        int max=7-Math.max(Y,W);
        switch (max) {
            case 1:
                System.out.println(1 + "/" + 6);
                break;
            case 2:
                System.out.println(1 + "/" + 3);
                break;
            case 3:
                System.out.println(1 + "/" + 2);
                break;
            case 4:
                System.out.println(2 + "/" + 3);
                break;
            case 5:
                System.out.println(5 + "/" + 6);
                break;
            case 6:
                System.out.println(1 + "/" + 1);
                break;
        }

    }
}
