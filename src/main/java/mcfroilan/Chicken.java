package mcfroilan;
public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;
    private int id;

    public static int uniqueID = 0;
    private boolean hasBeenFed;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenFed() {
        return hasBeenFed;
    }

    public void setHasBeenFed(boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
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
        System.out.println("This chicken is eating " + edible);
        setHasBeenFed(true);
    }

    @Override
    public void makeNoise() {
        System.out.println("bok bok");
    }

}