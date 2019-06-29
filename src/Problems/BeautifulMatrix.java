package Problems;

import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int c=0;
        int [][]arr=new int[5][5];
        // Writing loop
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arr [i][j]=scanner.nextInt();
            }
        }
        //Reading loop
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (arr [i][j]==1) {
                    c = Math.abs(i - 2) + Math.abs(j - 2);
                }
            }
        }
        System.out.println(c);
    }
}
