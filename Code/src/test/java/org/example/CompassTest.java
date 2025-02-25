package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    void initialiseCompass(){
        Compass c = new Compass();
        Compass.Node ch = c.getPoint();
        Assertions.assertEquals('N',ch.data);
        ch = ch.next;
        Assertions.assertEquals('E',ch.data);
        ch = ch.next;
        Assertions.assertEquals('S',ch.data);
        ch = ch.next;
        Assertions.assertEquals('W',ch.data);
        ch = ch.next;
        Assertions.assertEquals('N',ch.data);
        ch=ch.prev;
        Assertions.assertEquals('W',ch.data);
    }

}