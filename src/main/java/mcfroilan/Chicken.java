package mcfroilan;
public class Chicken extends Animal implements Produce{
    private boolean hasBeenFertilized;
    private int id;

    public static int uniqueID = 0;
    private boolean hasBeenFed;

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

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
    public Edible yield(){
        if(isHasBeenFertilized() == false){
            System.out.println("Chicken laid an egg!");
            return new EdibleEgg();
        }
        System.out.println("Chicken egg not edible!");
        return null;
    }

    @Override
    public void eat(Edible[] edibles) {
        if (isHasBeenFed() == false) {
            for (int i = 0; i < edibles.length; i++){
                edibles[i] = null;
            }
            setHasBeenFed(true);
            System.out.println("Chicken is eating!");
        } else{
            System.out.println("This chicken just ate!");
            setHasBeenFed(false);
        }

    }

    @Override
    public void makeNoise() {
        System.out.println("bok bok");
    }
}