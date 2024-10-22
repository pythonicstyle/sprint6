package com.example;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    @Test(expected = Exception.class)
    public void getFoodExceptionTest() throws Exception {
        Animal animal = new Animal();
        String expectedText = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        animal.getFood("скалка");
        Assert.fail(expectedText);
    }

    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String expectedText = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualText = animal.getFamily();
        Assert.assertEquals(expectedText, actualText);
    }
}
