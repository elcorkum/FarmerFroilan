package mcfroilan;

import java.util.Arrays;

public class CropRow{
    private Crop[] crops;

    public CropRow(int cropRowSize){
        this.crops = new Crop[cropRowSize];
    }

    public Crop[] getCrops() {
        return crops;
    }

    public void setCrops(Crop[] crops) {
        this.crops = crops;
    }

}