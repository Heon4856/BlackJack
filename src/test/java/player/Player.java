package test.java.player;

public class Player {
    private static int PlayerMoney =1000;

    public static int getMoney(int BatMoney){
        return BatMoney + Player.PlayerMoney;
    }
}
