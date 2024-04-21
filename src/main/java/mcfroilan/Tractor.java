package mcfroilan;

public class Tractor extends Vehicle implements FarmVehicle{
    private static boolean created = false;

    public Tractor(){
        oneFarmVehicle();
    }

    @Override
    public void oneFarmVehicle() {
        if(created) {
            throw new IllegalStateException("One has been created");
        }
        created = true;
    }
    public void makeNoise(){
        System.out.println("Vroom Vroom!");
    }
    public Crop[][] harvest(Crop[][] field){
        //go to row 1 and row 2 and check if crop has been fertilized
        //if yes harvest it and set crop to null, return number of crops harvested and setHasBeenHarvested to true
        //if not don't harvest and set hasBeenHarvested to false

        Crop[][] cropsHarvested = new Crop[2][10];
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < 2; j++){
                if (field[i][j].isHasBeenFertilized() == true){
                    if(field[i][j] instanceof TomatoPlant){
                        cropsHarvested[i][j] = new TomatoPlant();
                    } else if (field[i][j] instanceof CornStalk) {
                        cropsHarvested[i][j] = new CornStalk();
                    }
                    field[i][j] = null;
                    Crop.setHasBeenHarvested(true);
                } else {
                    Crop.setHasBeenHarvested(false);}
            }
        }
        return cropsHarvested;
    }

    @Override
    public void operate() {
        if(!getIsMounted()){
            makeNoise();
            System.out.println("Farmer is operating tractor on the farm");
        } else{
            System.out.println("Cannot be operated before mounting.");
        }
    }
}