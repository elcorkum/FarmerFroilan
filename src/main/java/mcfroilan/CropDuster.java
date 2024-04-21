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
    public void fertilize(Crop[][] cropRows){
        for(Crop[] cropRow: cropRows){
            for(Crop crop: cropRow){
                crop.setHasBeenFertilized(true);
                System.out.println("Current crop is being fertilized");

            }
        }
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