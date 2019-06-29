package Problems;

import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        int[] strips=new int[4];
        String input=scanner.nextLine();
        String[] splitted = input.split(" ");
        for (int i=0;i<4;i++){
            strips[i]=Integer.parseInt(splitted[i]);
        }
        input = scanner.nextLine();
        for (int i=0;i<input.length();i++){
            total+=strips[Character.getNumericValue(input.charAt(i))-1];
        }
        System.out.println(total);
    }
}
