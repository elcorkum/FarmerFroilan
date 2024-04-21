package mcfroilan;

public class CropDuster extends Aircraft implements FarmVehicle{

    private static boolean created = false;

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
//        if(!getIsMounted()) {
//            makeNoise();
//            fly();
//            System.out.println("Preparing to fertilize the crops");
//        } else{
//            System.out.println("Cannot be operated without mounting");
//        }


    }
    public void fertilize(CropRow[] cropRows){
        for(CropRow cropRow: cropRows){
            for(Crop crop: cropRow){
                crop.isHasBeenFertilized(true);
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