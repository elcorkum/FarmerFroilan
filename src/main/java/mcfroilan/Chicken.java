package mcfroilan;


public class Chicken extends Animal implements Produce{
    private EdibleEgg egg;
    private boolean hasBeenFertilized;
    private int id;

    public static int uniqueID = 0;

    public Chicken(){
        uniqueID++;
        id = uniqueID;
    }

    public int getId() {
        return id;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
    public Edible yield(){
        if(isHasBeenFertilized() == true){
            return new EdibleEgg();
        }
        return null;
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {
        System.out.println("bok bok");
    }
}