package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WednesdayTest {
@Test
    public void yieldFertilizeTest(){
        Chicken chicken = new Chicken();
        chicken.setHasBeenFertilized(true);
        Edible expected = chicken.yield();
        assertNotNull(expected);
        assertTrue(expected instanceof EdibleEgg);

    }
@Test
    public void yieldNotFertilizedTest(){
        Chicken chicken2 = new Chicken();
        chicken2.setHasBeenFertilized(false);
        Edible expected2 = chicken2.yield();
        assertNull(expected2);
}
@Test
    public void yieldTomatoPlant(){
    TomatoPlant plant = new TomatoPlant();
    plant.setHasBeenFertilized(true);
    plant.setHasBeenHarvested(true);
    Tomato tomato = plant.yield();
    assertNotNull(tomato);
}
@Test
    public void yieldTomatoPlantNot(){
    TomatoPlant plant2 = new TomatoPlant();
    plant2.setHasBeenFertilized(false);
    plant2.setHasBeenHarvested(false);
    Tomato tomato2 = plant2.yield();
    assertNull(tomato2);
}
@Test
    public void yieldCornStalk(){
    CornStalk corn1 = new CornStalk();
    corn1.setHasBeenFertilized(true);
    corn1.setHasBeenHarvested(true);
    EarCorn earCorn1 = corn1.yield();
    assertNotNull(earCorn1);
}
@Test
    public void yieldCornStalkNot(){
    CornStalk corn2 = new CornStalk();
    corn2.setHasBeenFertilized(false);
    corn2.setHasBeenHarvested(false);
    EarCorn earCorn2 = corn2.yield();
    assertNull(earCorn2);
}
}