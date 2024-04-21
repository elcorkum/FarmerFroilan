package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundayTest {

    @Test
    void plant() {
        Farmer froilan = new Farmer();

        CropRow cropRow1 = new CropRow(4);
        CropRow cropRow2 = new CropRow(4);
        CropRow cropRow3 = new CropRow(4);

        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();
        BeanStalk soybean = new BeanStalk();

        froilan.plant(corn,cropRow1,-1);
        froilan.plant(tomato, cropRow2, -1);
        froilan.plant(soybean, cropRow3, -1);

        Crop[] expected1 = {new CornStalk(), new CornStalk(), new CornStalk(), new CornStalk()};
        Crop[] expected2 = {new TomatoPlant(), new TomatoPlant(), new TomatoPlant(), new TomatoPlant()};
        Crop[] expected3 = {new BeanStalk(), new BeanStalk(), new BeanStalk(), new BeanStalk()};

        Crop[] actual1 = cropRow1.getCrops();
        Crop[] actual2 = cropRow2.getCrops();
        Crop[] actual3 = cropRow3.getCrops();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (Crop c : expected1){
            assertTrue(c instanceof CornStalk && actual1[count1] instanceof CornStalk);
            count1++;
        }
        for (Crop c : expected2){
            assertTrue(c instanceof TomatoPlant && actual2[count2] instanceof TomatoPlant);
            count2++;
        }
        for (Crop c : expected3){
            assertTrue(c instanceof BeanStalk && actual3[count3] instanceof BeanStalk);
            count3++;
        }
    }
}