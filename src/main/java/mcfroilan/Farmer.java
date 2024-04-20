package mcfroilan;
public class Farmer extends Person implements Botanist{
    private boolean riding;
    private Rideable mounted;


    @Override
    public void plant(Crop crop, CropRow cropRow, int index) {
        if (index == -1){
            for (int i = 0; i < cropRow.getCrops().length; i++){
                if (crop instanceof TomatoPlant) {
                    cropRow.getCrops()[i] = new TomatoPlant();
                }
                if (crop instanceof CornStalk){
                    cropRow.getCrops()[i] = new CornStalk();
                }
            }
        }
        else {
            if (crop instanceof TomatoPlant) {
                cropRow.getCrops()[index] = new TomatoPlant();
            }
            if (crop instanceof CornStalk){
                cropRow.getCrops()[index] = new CornStalk();
            }
        }
        }

    @Override
    public void eat(Edible edible) {
        System.out.println("This farmer eats a " + edible);
    }

    @Override
    public void makeNoise() {
        System.out.println("What in tarnation!");
    }

    @Override
    public void mount(Rideable rideable) {

        if (rideable instanceof Aircraft){
            System.out.println("Farmer is not a pilot.");
        }
        else if (this.riding == false)
        {
            if (rideable instanceof Vehicle) {
                System.out.println("farmer is riding a tractor.");
            }
            if (rideable instanceof Animal) {
                System.out.println("farmer is riding a horse.");
            }
            this.riding = true;
            this.mounted = rideable;
        }
        else{
            System.out.println("Farmer is riding something already, dismount.");

        }
    }

    @Override
    public void dismount() {
        if (this.riding == false) {
            System.out.println("Farmer is not riding anything.");
        }
        if (this.riding == true) {
            if (this.mounted instanceof Vehicle) {
                System.out.println("farmer dismounts a tractor.");
            }
            if (this.mounted instanceof Animal) {
                System.out.println("farmer dismounts a horse.");
            }

        }
    }

}
