package mcfroilan;
public class Horse extends Animal implements Rideable{
    private int id;

    public static int uniqueID = 0;

    public Horse(){
        uniqueID++;
        id = uniqueID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
}