package mcfroilan;
public class Horse extends Animal implements Rideable{
    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {
        System.out.println("Neigh!");
    }
}