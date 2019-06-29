package Problems;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noStones = Integer.parseInt(scanner.nextLine());
        int count=0;
        String input = scanner.nextLine();

        for (int i=0; i< input.length()-1;i++){
            if (input.charAt(i)==input.charAt(i+1)){
                count++;
            }
        }

        System.out.println(count);
    }
}
