package com.example;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTetra {
    Tetra tetra;
    @BeforeTest
    public void initTests() {
        tetra = new Tetra(new StoreFile());
    }
    @Test
    public void testCalcVolume_30_35() {        
        double actual = tetra.calcVolume(30, 35);
        double expected = 350.0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalcVolume_123_97() {        
        double actual = tetra.calcVolume(123, 97);
        double expected = 3977.0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalcVolume_1_1() {        
        double actual = tetra.calcVolume(1, 1);
        double expected = 0.3333333333333333;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCalcVolume_0_0() {        
        double actual = tetra.calcVolume(0, 0);
        double expected = 0.0;
        Assert.assertEquals(actual, expected);
    }


}
