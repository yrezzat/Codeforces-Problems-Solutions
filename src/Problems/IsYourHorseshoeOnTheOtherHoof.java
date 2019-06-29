package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] shoes=new int[4];
        for (int i=0; i<4;i++){
            shoes[i] = scanner.nextInt();
        }
        int counter = 0;

        Arrays.sort(shoes);
        for (int i=0;i<shoes.length-1;i++){
            if (shoes[i]==shoes[i+1]){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
