package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;


@RunWith(Parameterized.class)
public class LionParamTest {

    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }
    @Parameters
    public static Object[][] data() {
        return new Object[][] {
            { "Самец", true },
            { "Самка", false },
        };
    }

    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actualResult);
    }

}
