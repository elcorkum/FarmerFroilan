package mcfroilan;


public class TomatoPlant extends Crop {
    public Tomato yield(){
        Tomato tomato;
        if (hasBeenFertilized && hasBeenHarvested){
            tomato = new Tomato();
        } else{
            tomato = null;
        }
        return tomato;
    }
    }