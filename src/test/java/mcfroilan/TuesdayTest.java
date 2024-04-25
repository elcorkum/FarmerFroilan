package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuesdayTest {
    @Test
    public void  testTuesdayHarvest(){
        Farmer froilan = new Farmer();
        Farm farm = new Farm(new Crop[4][6]);
        froilan.setFieldValue(farm.getField());
        froilan.setFarm(farm);
        CornStalk corn = new CornStalk();
        froilan.plant(corn, 0);
        froilan.plant(corn, 1);
        froilan.plant(corn, 2);
        froilan.plant(corn, 3);
        Tractor tractor= new Tractor();
        Crop[][] actualHarvestedCrops = tractor.harvest(froilan.getFieldValue());
        Crop[][] expectedHarvestedCrops = new Crop[farm.getField().length][farm.getField()[0].length];
        for (int i = 0; i < farm.getField().length;i++){
            for (int y = 0; y < farm.getField()[i].length;y++){
//                expectedHarvestedCrops[i][y] = farm.getField()[i][y];
//                farm.getField()[i][y] = null;
                expectedHarvestedCrops[i][y] = null;
        }
    }
    assertArrayEquals(expectedHarvestedCrops,actualHarvestedCrops);
}
    }

