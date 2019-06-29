package Problems;
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        int noFriends, wallHeight, roadWidth=0;
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String[] splitStr = input.split("\\s+");
        noFriends=Integer.parseInt(splitStr[0]);
        wallHeight=Integer.parseInt(splitStr[1]);
        input=scanner.nextLine();
        String[] friendsHeights = new String [noFriends];
        friendsHeights= input.split("\\s+");
        for (int i=0;i<noFriends;i++){
            if (Integer.parseInt(friendsHeights[i])<=wallHeight){
                roadWidth+=1;
            } else if(Integer.parseInt(friendsHeights[i])>wallHeight){
                roadWidth+=2;
            }
        }
        System.out.println(roadWidth);
    }
}
