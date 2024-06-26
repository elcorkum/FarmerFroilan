package mcfroilan;


public class Tractor extends Vehicle implements FarmVehicle{
    private boolean inOperation;
    private static boolean created = false;

    public boolean isInOperation() {
        return inOperation;
    }

    public void setInOperation(boolean inOperation) {
        this.inOperation = inOperation;
    }

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
        Crop[][] cropsHarvested = new Crop[field.length][field[0].length];
        for (int i = 0; i < field.length; i++) {
            for(int j = 0; j < field[0].length; j++){
                if (field[i][j].hasBeenFertilized && field[i][j].hasBeenFertilized){
                    if(field[i][j] instanceof TomatoPlant){
                        cropsHarvested[i][j] = new TomatoPlant();
                    }
                    else if (field[i][j] instanceof CornStalk) {
                        cropsHarvested[i][j] = new CornStalk();
                    }
                    else if (field[i][j] instanceof BeanStalk) {
                        cropsHarvested[i][j] = new BeanStalk();
                    }
                    field[i][j] = null;
                }
                else {
                    field[i][j].setHasBeenHarvested(false);
//                    field[i][j] = null;
                }
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