package mcfroilan;

public class TomatoPlant extends Crop {

    private int id;
    public static int uniqueID;

    public TomatoPlant(){
        uniqueID++;
        id = uniqueID;
    }
    public Tomato yield(){
        Tomato tomato;
        if (!this.isHasBeenFertilized() && !this.isHasBeenHarvested()){
            tomato = new Tomato();
        } else{
            tomato = null;
        }
        return tomato;
    }
}