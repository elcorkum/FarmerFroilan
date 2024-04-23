package mcfroilan;
public class Horse extends Animal implements Rideable{
    private int id;
    public static int uniqueID = 0;
    private boolean hasBeenRidden;
    private boolean hasBeenFed;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean isHasBeenRidden() {
        return hasBeenRidden;
    }

    public void setHasBeenRidden(boolean hasBeenRidden) {
        this.hasBeenRidden = hasBeenRidden;
    }

    public boolean isHasBeenFed() {
        return hasBeenFed;
    }

    public void setHasBeenFed(boolean hasBeenFed) {
        this.hasBeenFed = hasBeenFed;
    }

    public Horse(){
        uniqueID++;
        id = uniqueID;
    }

    @Override
    public void eat(Edible[] edibles) {
        if (isHasBeenFed() == false) {
            for (int i = 0; i < edibles.length; i++){
                edibles[i] = null;
            }
            setHasBeenFed(true);
            System.out.println("Horse is eating!");
        } else{
            System.out.println("This horse just ate!");
            setHasBeenFed(false);
        }
    }
    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
    public void ride() {
        System.out.println("This horse is galloping.");
        setHasBeenRidden(true);
    }
}