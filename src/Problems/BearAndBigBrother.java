package Problems;

import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x,y,c=0;
        x=scanner.nextInt();
        y=scanner.nextInt();
        while(x<=y) {
            x*=3;
            y*=2;
            c++;
        }
        System.out.println(c);
    }
}
