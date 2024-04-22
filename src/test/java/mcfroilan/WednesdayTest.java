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
}