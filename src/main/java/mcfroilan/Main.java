package mcfroilan;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Farmer tim = new Farmer();
        CropRow corn = new CropRow(3);
        CornStalk cornStalk = new CornStalk();
        tim.plant(cornStalk, corn, -1);
        System.out.println(Arrays.toString(corn.getCrops()));
        Farm farm = new Farm();
       Chicken[][] chickenCoops = farm.makeChickens();
       Tractor tractor = new Tractor();
       Horse horse = new Horse();
       CropDuster cropDuster = new CropDuster();
       tim.mount(tractor);
       tim.dismount();
       //tim.mount(tractor);
       //tim.mount(horse);

        //System.out.println(Arrays.deepToString(farm.makeChickens()));
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        System.out.println(chicken1.getId());
        System.out.println(chicken2.getId());
        System.out.println(chicken3.getId());
        for(Chicken[] chickenCoop: chickenCoops) {
            for(Chicken chicken: chickenCoop){
                if(chicken != null && chicken.getId() == 13){
                    chicken.makeNoise();
                }
            }
        }




    }
}
