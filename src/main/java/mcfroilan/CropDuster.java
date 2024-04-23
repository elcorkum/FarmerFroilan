package mcfroilan;

public class CropDuster extends Aircraft implements FarmVehicle{

    private static boolean created = false;
    private boolean inOperation;

    public boolean isInOperation() {
        return inOperation;
    }

    public void setInOperation(boolean inOperation) {
        this.inOperation = inOperation;
    }

    public CropDuster(){
        oneFarmVehicle();
    }

    @Override
    public void oneFarmVehicle() {
        if(created) {
            throw new IllegalStateException("One has been created already");
        }
        created = true;
    }

    @Override
    public void operate() {
        System.out.println("Pilot starting crop duster engine...");
        makeNoise();
        fly();
        setInOperation(true);
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
        System.out.println("Nyoooommmm");
    }

    @Override
    public void fly() {
        System.out.println("Flying over the field of crops.");
    }
}