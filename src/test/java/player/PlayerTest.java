package test.java.player;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void GetMoney(){
        int result = Player.getMoney(100);
        assertEquals(1100, result);
    }

    @Test
    void GetCard(){
        ArrayList<String> result = Player.GetCard("s1");
        ArrayList<String> test = new ArrayList();
        test.add("s1");
        assertEquals( test, result);
    }

    }
