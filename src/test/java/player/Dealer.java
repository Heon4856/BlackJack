package test.java.player;

public class Dealer extends Player{

    public void under16_getcards_else_stay(int sum_cards){
        if (sum_cards <=16){
            Dealer.GetCard();
        }

    }
}
