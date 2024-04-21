package mcfroilan;


public class Pilot extends Person {

    private boolean riding;
    private Rideable mounted;

    @Override
    public void eat(Edible edible) {
        System.out.println("Pilot is eating " + edible);
    }

    @Override
    public void mount(Rideable rideable) {
        if (rideable instanceof Tractor) {
            System.out.println("Pilot is not a farmer.");
        } else if (this.riding == false) {
            if (rideable instanceof Vehicle) {
                System.out.println("Pilot is flying a crop duster.");
            }
            if (rideable instanceof Animal) {
                System.out.println("Pilot is riding a horse.");
            }
            this.riding = true;
            this.mounted = rideable;
        } else {
            System.out.println("Pilot is riding or flying already, please dismount them.");

        }
    }


    @Override
    public void dismount(Rideable rideable) {
        if (this.riding == false) {
            System.out.println("Pilot is not riding or flying.");
        }
        if (this.riding == true) {
            if (this.mounted instanceof Vehicle) {
                System.out.println("Pilot dismounts a crop duster.");
            }
            if (this.mounted instanceof Animal) {
                System.out.println("Pilot dismounts a horse.");
            }
        }
    }

    @Override
    public void makeNoise() {
        System.out.println("Time to fly!");
    }
}