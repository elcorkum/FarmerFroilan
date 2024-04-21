package mcfroilan;


public class Pilot extends Person {

    private boolean riding;
    private Rideable mounted;
    private boolean hasEaten;

    public boolean getHasEaten() {
        return hasEaten;
    }

    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }

    @Override
    public void eat(Edible[] edibles) {
        if (this.getHasEaten() == false){
            for (int i = 0; i < edibles.length; i++){
                if (edibles[i] instanceof EdibleEgg) {
                    System.out.println("Sunny-side up for the win!");
                }
                if(edibles[i] instanceof EarCorn){
                    System.out.println("I love corn");
                }
                if(edibles[i] instanceof Tomato){
                    System.out.println("Yum...Love me some tomato!");
                }
                setHasEaten(true);
            }
        } else {
            System.out.println("Pilot has already eaten");
            setHasEaten(false);
        }
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
    public void dismount() {
        if (this.riding == false) {
            System.out.println("Pilot is not riding or flying.");
        }
        else if (this.riding == true) {
            if (this.riding == false) {
                System.out.println("Pilot dismounts a crop duster.");
            }
            if (this.mounted instanceof Animal) {
                System.out.println("Pilot dismounts a horse.");
            }
        }
        this.riding = false;
        this.mounted = null;
    }

    @Override
    public void makeNoise() {
        System.out.println("Time to fly!!");
    }
}