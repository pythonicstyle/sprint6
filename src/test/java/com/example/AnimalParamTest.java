package com.example;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;
    private final List<String> food;

    public AnimalParamTest(String animalKind, List<String> food) {
        this.animalKind = animalKind;
        this.food = food;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
            { "Травоядное", List.of("Трава", "Различные растения") },
            { "Хищник", List.of("Животные", "Птицы", "Рыба") },
            };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal animal = new Animal();
        List<String> actualFood = animal.getFood(animalKind);
        Assert.assertEquals(food, actualFood);
    }
}
