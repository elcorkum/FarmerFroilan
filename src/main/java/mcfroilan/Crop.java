package mcfroilan;

public abstract class Crop implements Produce{

    public boolean hasBeenHarvested;
    public  boolean hasBeenFertilized;
    private static  int cropCounter = 0;
    private int Id;
  
    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public  void setHasBeenHarvested(boolean hasBeenHarvested) {
        hasBeenHarvested = hasBeenHarvested;
    }

    public boolean getHasBeenFertilized() {
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

public String toString(){
        return "Crop ID: " + Id;
}

    }


