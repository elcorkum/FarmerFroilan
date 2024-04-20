package mcfroilan;
public class Farmer extends Person implements Botanist{
    private boolean riding;


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
            System.out.println("You are not a pilot.");
        }
        if (this.riding == false)
        {
            if (rideable instanceof Vehicle) {
                System.out.println("farmer is riding a tractor.");
            }
            if (rideable instanceof Animal) {
                System.out.println("farmer is riding a horse.");
            }
            this.riding = true;
        }
        else{
            System.out.println("Farmer is riding something already, dismount.");
        }
    }

    @Override
    public void dismount(Rideable rideable) {
        if (this.riding == false) {
            System.out.println("Farmer is not riding anything.");
        }
        if (this.riding == true) {
            if (rideable instanceof Vehicle) {
                System.out.println("farmer dismounts a tractor.");
            }
            if (rideable instanceof Animal) {
                System.out.println("farmer dismounts a horse.");
            }
        }
    }

}
