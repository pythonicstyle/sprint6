package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;


public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyTest() {
        String expectedText = "Кошачьи";
        String actualText = feline.getFamily();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void getKittensTest() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensWithCountTest() {
        int expectedKittensCount = 2;
        int actualKittensCount = feline.getKittens(2);
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }
}
