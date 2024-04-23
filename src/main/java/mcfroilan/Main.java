package mcfroilan;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        //Chicken Methods
        Chicken chicken1 = new Chicken();
        chicken1.yield();
        System.out.println(chicken1.getId());
        chicken1.setHasBeenFertilized(true);
        chicken1.yield();
       Tomato tomato1 = new Tomato();
       EarCorn earcorn1 = new EarCorn();
       EdibleEgg egg1 = new EdibleEgg();
       Edible[] chickenFood = {tomato1, earcorn1, egg1};
       chicken1.eat(chickenFood);
       chicken1.eat(chickenFood);
       chicken1.makeNoise();
       Chicken chicken2 = new Chicken();
        System.out.println(chicken2.getId());
        System.out.println(chicken1.getId());
        System.out.println("================");

        //CornStalk methods
        CornStalk corn1 = new CornStalk();
        corn1.setHasBeenHarvested(true);
        corn1.setHasBeenFertilized(true);
        corn1.yield();
        corn1.setHasBeenFertilized(false);
        corn1.yield();
        System.out.println(corn1.getId());
        CornStalk corn2 = new CornStalk();
        System.out.println(corn2.getId());
        System.out.println(corn1.getId());
        System.out.println("================");

        //TomatoPlant methods
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.setHasBeenHarvested(true);
        tomatoPlant.yield();
        tomatoPlant.setHasBeenFertilized(false);
        tomatoPlant.yield();
        System.out.println(tomatoPlant.getId());
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        System.out.println(tomatoPlant2.getId());
        System.out.println(tomatoPlant.getId());
        System.out.println("================");

        //Horse methods
        Horse horse1 = new Horse();
        Tomato tomato2 = new Tomato();
        EarCorn earcorn2 = new EarCorn();
        EdibleEgg egg2 = new EdibleEgg();
        Edible[] horseFood = {tomato1, earcorn1, egg1};
        horse1.eat(horseFood);
        horse1.eat(horseFood);
        horse1.makeNoise();
        horse1.ride();
        System.out.println(horse1.getId());
        Horse horse2 = new Horse();
        System.out.println(horse2.getId());
        System.out.println(horse1.getId());
        System.out.println("================");

        //Pilot methods
        Pilot froilanda = new Pilot();
        Tomato tomato3 = new Tomato();
        EarCorn earcorn3 = new EarCorn();
        EdibleEgg egg3 = new EdibleEgg();
        Edible[] froilandasFood = {tomato3, earcorn3, egg3};
        froilanda.eat(froilandasFood);
        froilanda.eat(froilandasFood);
        froilanda.mount(horse2);
        froilanda.dismount();
        froilanda.makeNoise();
        System.out.println("================");



    }

}

