package Problems;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = Integer.parseInt(scanner.nextLine());
        int total=0;
        int kits[]=new int[teams*2];
        String input, splitted[];
        for (int i=0; i<kits.length;i+=2){
            input=scanner.nextLine();
            splitted=input.split(" ");
            kits[i]=Integer.parseInt(splitted[0]);
            kits[i+1]=Integer.parseInt(splitted[1]);
        }

        //System.out.println(Arrays.toString(kits));

        for (int i=0; i<kits.length;i++){
            for (int j=i+1;j<kits.length;j++){
                if (kits[i]==kits[j] && ( ( i%2==0 && j%2==1 ) || ( j%2==0&& i%2==1 ))){
                    total++;
                }
            }
        }

        System.out.println(total);
    }
}
