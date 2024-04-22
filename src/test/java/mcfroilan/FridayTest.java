package mcfroilan;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FridayTest {
    EdibleEgg e1 = new EdibleEgg();
    EdibleEgg e2 = new EdibleEgg();
    EdibleEgg e3 = new EdibleEgg();
    EdibleEgg e4 = new EdibleEgg();
    EdibleEgg e5 = new EdibleEgg();

    EarCorn earCorn = new EarCorn();
    EarCorn earCorn2 = new EarCorn();

    Tomato t1 = new Tomato();
    Tomato t2 = new Tomato();

    @Test
    public void chickenEatTest(){
        Chicken chicken = new Chicken();
        Edible[] chickenFood = {earCorn, t1};
        if (chicken.isHasBeenFed() == false) {
            for (int i = 0; i < chickenFood.length; i++){
                chickenFood[i] = null;
                assertNull(chickenFood[i]);
            }
            chicken.setHasBeenFed(true);
            assertTrue(chicken.isHasBeenFed());
        }
    }

    @Test
    public void chickenAlreadyAte(){
        Chicken chicken = new Chicken();
        Edible[] chickenFood = {earCorn, t1};
        chicken.eat(chickenFood);
        boolean actual = true;
        boolean expected = chicken.isHasBeenFed();

        assertEquals(actual, expected);

        chicken.eat(chickenFood);
        if(chicken.isHasBeenFed() == true){
            chicken.setHasBeenFed(false);
            assertTrue(chicken.isHasBeenFed());
        }
    }

    @Test
    public void horseEatTest(){
        Horse horse = new Horse();
        Edible[] horseFood = {earCorn, t1, earCorn2, t2};
        horse.eat(horseFood);
        if(horse.isHasBeenFed() == false) {
            for (int i = 0; i < horseFood.length; i++){
                horseFood[i] = null;
                assertNull(horseFood[i]);
            }
            horse.setHasBeenFed(true);
            assertTrue(horse.isHasBeenFed());
        }
    }

    @Test
    public void horseAlreadyAte(){
        Horse horse = new Horse();
        Edible[] horseFood = {earCorn, t1, earCorn2, t2};
        horse.eat(horseFood);
        boolean actual = true;
        boolean expected = horse.isHasBeenFed();

        assertEquals(actual, expected);

        horse.eat(horseFood);
        if(horse.isHasBeenFed() == true){
            horse.setHasBeenFed(false);
            assertTrue(horse.isHasBeenFed());
        }
    }

    @Test
    public void farmerEatTest(){
        Farmer rookie = new Farmer();
        Edible[] farmerFood = {e4, earCorn, e3, t1, earCorn2, e1, e2};
        rookie.eat(farmerFood);
        if (rookie.getHasEaten() == false){
            for(int i = 0; i < farmerFood.length; i++){
                if (farmerFood[i] instanceof EdibleEgg) {
                    assertInstanceOf(EdibleEgg.class, farmerFood[i]);
                }
                if(farmerFood[i] instanceof EarCorn){
                    assertInstanceOf(EarCorn.class, farmerFood[i]);
                }
                if(farmerFood[i] instanceof Tomato){
                    assertInstanceOf(Tomato.class, farmerFood[i]);
                }
                farmerFood[i] = null;
                assertNull(farmerFood[i]);
            }
            rookie.setHasEaten(true);
            assertTrue(rookie.getHasEaten());
        }


    }

    @Test
    public void farmerAlreadyAteTest(){
        Farmer rookie = new Farmer();
        Edible[] farmerFood = {e4, earCorn, e3, t1, earCorn2, e1, e2};
        rookie.eat(farmerFood);
        boolean actual = true;
        boolean expected = rookie.getHasEaten();
        assertEquals(actual, expected);

        rookie.eat(farmerFood);

        if(rookie.getHasEaten() == true) {
            rookie.setHasEaten(false);
            assertTrue(rookie.getHasEaten());
        }

    }





}