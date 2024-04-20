package mcfroilan;


public class Chicken extends Animal implements Produce{
    private EdibleEgg egg;
    private boolean hasBeenFertilized;
    private int id;

    public static int uniqueID = 0;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenHarvested;
    }

    public Chicken(){

        uniqueID++;
        id = uniqueID;
    }

    public int getId() {
        return id;
    }

    public Edible yield(){
        Edible egg;
        if(!hasBeenFertilized){
            egg = new EdibleEgg();
            setHasBeenFertilized(true);
        } else{
            egg = null;
            setHasBeenFertilized(false);
            System.out.println("There is no egg to collect at this time.");
        }

       return egg;
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {
        System.out.println("bok bok");
    }

}