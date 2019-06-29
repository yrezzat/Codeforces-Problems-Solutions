package Problems;

import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test="";
        String input = scanner.nextLine();
        int count=0;

        for (int i=0; i<input.length();i++){
            if (!(test.contains(String.valueOf(input.charAt(i))))){
                test+=input.charAt(i);
                count++;
            }
        }
        if (count%2==0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
