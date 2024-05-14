package mcfroilan;

import org.junit.jupiter.api.Test;

public class EverydayMorningRoutine {

    /*
    Riding each Horse in each Stable.
    Feeding each Horse 3 ear of Corn.
            For breakfast,
    Froilan eats 1 EarCorn, 2 Tomoato, and 5 Egg.
    Froilanda eats 2 EarCorn, 1 Tomoato, and 2 Egg.
          */

    @Test
    void eatTest() {
        Pilot froilanda = new Pilot();
        Farmer frolian = new Farmer();
        Tomato tomato = new Tomato();
        Horse horse = new Horse();
        EarCorn earCorn = new EarCorn();
        froilanda.eat(new EarCorn[]{earCorn});
        frolian.eat(new Tomato[]{tomato});
    }





}
