package Problems;

import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        String input=scanner.nextLine();
        int pointer=1;
        for (int i=0;i<input.length();i++){
            total+=Math.min(Math.abs(((int)input.charAt(i)-96)-pointer),
                    26-Math.abs(((int)input.charAt(i)-96)-pointer));
            pointer =(int)input.charAt(i)-96;
        }
        System.out.println(total);
    }
}
