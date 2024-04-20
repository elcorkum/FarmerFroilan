package mcfroilan;

public class Tractor extends Vehicle implements FarmVehicle{
    public void makeNoise(){
        System.out.println("Vroom Vroom!");
    }
    public Crop harvest(){

        return null;
    }

    @Override
    public void operate() {
        if(getIsMounted() == true){
            makeNoise();
            System.out.println("Farmer is operating tractor on the farm");
        }
    }
}