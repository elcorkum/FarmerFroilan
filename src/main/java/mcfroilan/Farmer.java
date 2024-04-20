package mcfroilan;
public class Farmer extends Person implements Botanist{


    @Override
    public void plant(Crop crop, CropRow cropRow) {

    }

    @Override
    public void eat(Edible edible) {

    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println("Farmer is mounting " + rideable);
        if (rideable instanceof Vehicle){
            ((Vehicle) rideable).setIsMounted(true);
        }
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println("Farmer is dismounting " + rideable);
        if (rideable instanceof Vehicle ) {
            ((Vehicle) rideable).setIsMounted(false);
        }
    }
}