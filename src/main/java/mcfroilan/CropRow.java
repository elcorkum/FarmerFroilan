package mcfroilan;

import java.util.Arrays;

public class CropRow{
    private Crop[] crops;

    private static int cropRowCount=0;
    private int id;
    public CropRow (int size){
        this.id=cropRowCount++;
        this.crops =new Crop[size];
    }

    public int getId() {
        return id;
    }

    public Crop[] getCrops() {
        return crops;
    }
      
    public void setCrops(Crop[] crops) {
        this.crops = crops;
    }
}