package mcfroilan;

import org.junit.jupiter.api.Test;

class MondayTest {

    @Test
    void eatTest() {
    Pilot frolandia = new Pilot();
    Tomato tomato = new Tomato();
    Horse horse = new Horse();
    EarCorn earCorn = new EarCorn();
    frolandia.eat(new EarCorn[]{earCorn});
    //ADD TO STRING TO EDIBLE OBJECTS
    }

    @Test
    void mountTest() {
        Pilot frolandia = new Pilot();
        CropDuster cropDuster = new CropDuster();
        frolandia.mount(cropDuster);
        Farmer froilan = new Farmer();
        froilan.mount(cropDuster);
    }

    @Test
    void dismountTest() {
        Pilot frolandia = new Pilot();
        CropDuster cropDuster = new CropDuster();
        frolandia.mount(cropDuster);
        Farmer froilan = new Farmer();
        Tractor tractor = new Tractor();
        //froilan.mount(tractor);
        frolandia.dismount();
        //froilan.dismount();
        System.out.println();
        //froilan.dismount();
        frolandia.dismount();

    }

    @Test
    void makeNoiseTest() {
        Pilot frolandia = new Pilot();
        frolandia.makeNoise();


    }

}