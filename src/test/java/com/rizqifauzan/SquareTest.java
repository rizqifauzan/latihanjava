package com.rizqifauzan;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testLuasPersegi(){
        Square square = new Square(7);

        // Mengecek / Verify -> Assert
        Assert.assertEquals(49, square.getLuas());
    }
}
