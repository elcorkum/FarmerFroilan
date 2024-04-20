package mcfroilan;


public class Pilot extends Person {
    @Override
    public void eat(Edible edible) {
        System.out.println("Pilot is eating " + edible);
    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("Getting on the " );
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("Getting off the rideable");
    }

    @Override
    public void makeNoise() {

    }
}