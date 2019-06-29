package Problems;

import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        int noGames,antonyWons=0,danikWons=0;
        Scanner scanner = new Scanner(System.in);
        noGames=Integer.parseInt(scanner.nextLine());
        char [] gameStats = new char[noGames];
        String input = scanner.nextLine();

        for (int i=0;i<noGames;i++){

            gameStats[i]=input.charAt(i);
            if (gameStats[i]=='A'){
                antonyWons++;
            }else{
                danikWons++;
            }
        }
        if (antonyWons>danikWons){
            System.out.println("Anton");
        }else if (danikWons>antonyWons){
            System.out.println("Danik");
        }else if (danikWons==antonyWons){
            System.out.println("Friendship");
        }
    }
}
