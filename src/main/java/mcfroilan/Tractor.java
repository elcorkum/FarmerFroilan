package mcfroilan;

public class Tractor extends Vehicle implements FarmVehicle{


    private static boolean created = false;

    public Tractor(){
        if(created) {
            throw new IllegalStateException("One has been created");
        }
        created = true;
    }



    public void makeNoise(){

    }
    public Crop harvest(){

        return null;
    }

    @Override
    public void operate() {

    }
}