package test.java.player;

import java.util.ArrayList;

public class Player {
    private static int PlayerMoney =1000;
    private static ArrayList<String> PlayerCard= new ArrayList<>();


    public static int getMoney(int BatMoney){

        return BatMoney + Player.PlayerMoney;
    }


    public static ArrayList<String> GetCard(String card){
        Player.PlayerCard.add("s1");
        System.out.println(PlayerCard);
        return Player.PlayerCard;

    }

}
