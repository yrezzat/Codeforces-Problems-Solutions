package Problems;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int lowCount=0,upCount=0;

        for (int i=0;i<input.length();i++){
            if (input.charAt(i)<97){
                upCount++;
            }else{
                lowCount++;
            }
        }

        if (lowCount>upCount || lowCount==upCount){
            System.out.println(input.toLowerCase());
        }else{
            System.out.println(input.toUpperCase());
        }

    }
}
