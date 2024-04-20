package mcfroilan;

public class CropDuster extends Aircraft implements FarmVehicle{

    private static boolean created = false;

    public CropDuster(){
        if(created) {
            throw new IllegalStateException("One has been created");
        }
        created = true;
    }

    @Override
    public void operate() {
    }
    public void fertilize(CropRow[] cropRows){
    }
    @Override
    public void makeNoise(){
    }

    @Override
    public void fly() {
    }
}