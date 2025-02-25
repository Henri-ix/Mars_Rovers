package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    @Test
    void getVariablesTest(){
        Rover rv = new Rover(0,0,'N');
        Assertions.assertEquals(0,rv.getX());
        Assertions.assertEquals(0,rv.getY());
        Assertions.assertEquals('N',rv.getCardinal());
    }

    @Test
    void setVariablesTest(){
        Rover rv = new Rover(0,0,'N');
        rv.setX(rv.x+1);
        rv.setY(rv.y+1);
        rv.setCardinal('S');
        Assertions.assertEquals(1,rv.getX());
        Assertions.assertEquals(1,rv.getY());
        Assertions.assertEquals('S',rv.getCardinal());
    }

    @Test
    void getDetails(){
        Rover rv = new Rover(0,0,'N');
        rv.setX(rv.x+1);
        rv.setY(rv.y+1);
        rv.setCardinal('S');
        Assertions.assertEquals("1,1,S",rv.toString());
    }
}