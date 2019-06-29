package Problems;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String temp="";

        if (Character.isLowerCase(input.charAt(0))){
            temp+=Character.toUpperCase(input.charAt(0));
            for (int i=1;i<input.length();i++){
                temp+=input.charAt(i);
            }
            System.out.println(temp);
        }else{
            System.out.println(input);
        }

    }
}
