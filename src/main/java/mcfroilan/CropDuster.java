package mcfroilan;

public class CropDuster extends Aircraft implements FarmVehicle{
    @Override
    public void operate() {
        if(!getIsMounted()) {
            makeNoise();
            fly();
            System.out.println("Preparing to fertilize the crops");
        } else{
            System.out.println("Cannot be operated without mounting");
        }

    }
    public void fertilize(CropRow[] cropRows){
    }
    @Override
    public void makeNoise(){
        System.out.println("Making flying noise");
    }

    @Override
    public void fly() {
        System.out.println("Flying over the field of crops.");
    }
}