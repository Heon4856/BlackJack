package test.java.player;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void GetMoney(){
        int result = Player.getMoney(100);
        assertEquals(1100, result);


    }

    }
