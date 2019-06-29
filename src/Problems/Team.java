package Problems;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,x,y,z,c=0;
        n=scanner.nextInt();
        for (int i=1;i<=n;i++){
            x=scanner.nextInt();
            y=scanner.nextInt();
            z=scanner.nextInt();
            if (y+x+z>=2){
                c++;
            }
        }
        System.out.println(c);
    }
}
