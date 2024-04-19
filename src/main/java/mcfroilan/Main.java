package mcfroilan;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Farm farm = new Farm();
       Chicken[][] chickenCoops = farm.makeChickens();
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
