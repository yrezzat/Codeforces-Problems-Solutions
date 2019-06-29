package Problems;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noMagnets = Integer.parseInt(scanner.nextLine());
        int[] magnets=new int[noMagnets];
        int count=1;

        for (int i=0;i<noMagnets;i++){
            magnets[i]=Integer.parseInt(scanner.nextLine());
        }

        for (int i=0;i<magnets.length-1;i++){
            if (magnets[i]!=magnets[i+1]){
                count++;
            }
        }

        System.out.println(count);


    }
}
