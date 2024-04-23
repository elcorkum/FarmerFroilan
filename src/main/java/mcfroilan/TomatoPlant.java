package mcfroilan;

public class TomatoPlant extends Crop {

    private int id;
    public static int uniqueID = 0;

    public TomatoPlant(){
        uniqueID++;
        id = uniqueID;
    }

    @Override
    public int getId() {
        return id;
    }

    public Tomato yield(){
        Tomato tomato;
      
        if (hasBeenFertilized && hasBeenHarvested){
            tomato = new Tomato();
            System.out.println("Edible tomato");
        } else{
            tomato = null;
            System.out.println("Tomato not edible");
        }
        return tomato;
    }


}