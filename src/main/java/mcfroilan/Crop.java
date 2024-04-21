package mcfroilan;

public abstract class Crop implements Produce{
    public boolean hasBeenHarvested;
    public boolean hasBeenFertilized;
    private static  int cropCounter = 0;
    private int Id;

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public static void setHasBeenHarvested(boolean hasBeenHarvested) {
        hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public Crop (){
        this.Id= cropCounter++;
    }

    public int getId() {
        return Id;
    }


}
