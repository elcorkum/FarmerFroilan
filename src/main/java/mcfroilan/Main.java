package mcfroilan;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Farm farm = new Farm();
       Chicken[][] chickenCoops = farm.makeChickens();
        farm.makeChickens();
        for(Chicken[] chickenCoop: chickenCoops) {
            for(Chicken chicken: chickenCoop){
                if(chicken != null && chicken.getId() == 13){
                    chicken.makeNoise();
                }
            }
        }




    }
}
