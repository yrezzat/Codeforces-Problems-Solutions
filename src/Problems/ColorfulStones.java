package Problems;

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String colors=scanner.nextLine();
        String instructions=scanner.nextLine();
        int j=0,counter=1;


        for (int i=0; i<instructions.length();i++){
            if (instructions.charAt(i) == colors.charAt(j)) {
                counter++;
                j++;
            }
        }

        System.out.println(counter);
    }
}
