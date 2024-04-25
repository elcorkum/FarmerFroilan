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



        //CropDuster methods
        CropDuster cropDuster = new CropDuster();
        //CropDuster cropDuster1 = new CropDuster();
        cropDuster.operate();
        TomatoPlant t = new TomatoPlant();
        TomatoPlant t1 = new TomatoPlant();
        CornStalk c = new CornStalk();
        CornStalk c2 = new CornStalk();
        Crop[] row1 = {t,t1};
        Crop[] row2 = {c, c2};
        Crop[][] farmerField = {row1, row2};
        cropDuster.fertilize(farmerField);
        System.out.println("================");

        //EarCorn and Tomato id tests
        System.out.println(t.getId());
        System.out.println(t1.getId());
        System.out.println(t.getId());
        System.out.println(c.getId());
        System.out.println(c2.getId());
        System.out.println(c.getId());
        System.out.println("================");

        //Tractor method tests
        Tractor tractor = new Tractor();
        tractor.makeNoise();
        //Tractor tractor2 = new Tractor();
        tractor.operate();
        Crop[][] cropsHarvested = tractor.harvest(farmerField);
        System.out.println(Arrays.deepToString(cropsHarvested));
        System.out.println("================");

        //Farmer method tests
        Farm farm = new Farm(new Crop[3][3]);
        Farmer froilan = new Farmer();
        froilan.setFieldValue(farm.getField());
        froilan.setFarm(farm);
        BeanStalk soybean = new BeanStalk();
        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();
        froilan.plant(soybean, 2);
        froilan.plant(corn, 0);
        froilan.plant(tomato, 1);
        Edible[] froilanFood = new Edible[] {new EdibleEgg(), new EarCorn(), new Tomato()};
        System.out.println(Arrays.deepToString(froilan.getFieldValue()));
        froilan.eat(froilanFood);
        froilan.makeNoise();
        froilan.mount(horse1);
        froilan.dismount();






    }

}

