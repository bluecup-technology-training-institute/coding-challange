package org.example.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOTest {

    @Test
    void sampleTests() {
       // assertEquals(true, XO.getXO("xxxooo"));
        assertEquals(false, XO.getXO("xooxx"));
        //assertEquals(true, XO.getXO("zpzpzppxxoo"));
       // assertEquals(false, XO.getXO("zzoo"));


    }

}