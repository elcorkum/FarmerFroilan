package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FridayTest{

    @Test
    public void chickenEatTest(){

        Chicken chicken = new Chicken();
        Tomato tomato = new Tomato();
        Tomato t2 = new Tomato();
        Edible[] chickenFood = {tomato, t2};
        chicken.eat(chickenFood);

        boolean actual = chicken.isHasBeenFed();
        assertTrue(actual);
    }
    @Test
    public void horseEatTest(){
        Horse horse = new Horse();
        EarCorn earCorn = new EarCorn();
        Tomato t = new Tomato();
        Edible[] horseFood = {earCorn, t};
        horse.eat(horseFood);

        boolean actual = horse.isHasBeenFed();
        assertTrue(actual);
    }

    @Test
    public void farmerEatTest(){
        Farmer rookie = new Farmer();
        EdibleEgg egg = new EdibleEgg();
        Tomato t1 = new Tomato();
        Tomato t2 = new Tomato();
        EarCorn earCorn = new EarCorn();
        EdibleEgg e1 = new EdibleEgg();
        EdibleEgg e2 = new EdibleEgg();
        EdibleEgg e3 = new EdibleEgg();
        EdibleEgg e4 = new EdibleEgg();
        EdibleEgg e5 = new EdibleEgg();
        Edible[] farmerFood = {e1, t1, t2, e2, e3, e4, e5};
        Edible[] expectedFoodLeft = new Edible[7];
        rookie.eat(farmerFood);
        boolean actual = rookie.getHasEaten();

        assertTrue(actual);
        assertArrayEquals(farmerFood, expectedFoodLeft);
        assertInstanceOf(EdibleEgg.class, e1);
        assertInstanceOf(Tomato.class, t1);
    }

}
