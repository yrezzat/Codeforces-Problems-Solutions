package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c,temp;
        c=scanner.nextInt();
        int arr[]=new int[c];
        // Writing loop
        for (int i=0;i<c;i++){
            arr[i]=scanner.nextInt();
        }

        // Reading loop
        Arrays.sort(arr);

        // Printing loop
        for (int i=0;i<c;i++){
            System.out.print(arr[i]+ "\t");
        }
    }
}
