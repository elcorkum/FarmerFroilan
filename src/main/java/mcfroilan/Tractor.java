package mcfroilan;

public class Tractor extends Vehicle implements FarmVehicle{

    private boolean inOperation;

    public boolean isInOperation() {
        return inOperation;
    }

    public void setInOperation(boolean inOperation) {
        this.inOperation = inOperation;
    }

    public void makeNoise(){
        System.out.println("Vroom Vroom!");
    }

    public Crop[][] harvest(Crop[][] field){
        Crop[][] cropsHarvested = new Crop[2][10];
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < 2; j++){
                if (field[i][j].isHasBeenFertilized() == true){
                    if(field[i][j] instanceof TomatoPlant){
                        cropsHarvested[i][j] = new TomatoPlant();
                    } else if (field[i][j] instanceof CornStalk){
                        cropsHarvested[i][j] = new CornStalk();
                    }
                   field[i][j].setHasBeenHarvested(true);
                    field[i][j] = null;
                } else {
                    field[i][j].setHasBeenHarvested(false);}
            }
        }
        return cropsHarvested;
    }

    @Override
    public void operate() {
        System.out.println("Farmer starting tractor engine...");
        makeNoise();
        setInOperation(true);
    }
}