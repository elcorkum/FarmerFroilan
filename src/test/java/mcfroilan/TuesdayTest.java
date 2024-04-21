package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuesdayTest {
    @Test
    public void  testTuesdayHarvest(){
        Farm farm = new Farm();
      Crop[][] field=farm.createField();
        Tractor tractor= new Tractor();
      Crop[][] actualHarvestedCrops = tractor.harvest(field);
      Crop[][] expectedHarvestedCrops=new Crop[5][10];
    for (int i=0; i < field.length;i++){
    for (int y =0; y < field[i].length;y++){
        expectedHarvestedCrops[i][y]=field[i][y];
            field[i][y]=null;
        }
    }
    assertArrayEquals(expectedHarvestedCrops,actualHarvestedCrops);
}
    }

