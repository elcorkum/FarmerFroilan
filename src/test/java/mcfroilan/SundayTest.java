package mcfroilan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SundayTest {

    @Test
    void plantTest() {
        Farmer froilan = new Farmer();
        Farm farm = new Farm(new Crop[3][3]);
        froilan.setFieldValue(farm.getField());
        froilan.setFarm(farm);

        CornStalk corn = new CornStalk();
        TomatoPlant tomato = new TomatoPlant();
        BeanStalk soybean = new BeanStalk();

        froilan.plant(corn, 0);
        froilan.plant(tomato, 1);
        froilan.plant(soybean, 2);

        Crop[][] expected = {{new CornStalk(), new CornStalk(), new CornStalk()}, {new TomatoPlant(), new TomatoPlant(), new TomatoPlant()}, {new BeanStalk(), new BeanStalk(), new BeanStalk()}};


        Crop[][] actual = froilan.getFieldValue();


        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int countRow = 0;
        for (Crop[] cr : expected) {
            for (Crop c : cr) {
                if (c instanceof CornStalk) {
                    assertInstanceOf(CornStalk.class, actual[countRow][count1]);
                    count1++;
                    if (count1 == actual[0].length) {
                        countRow++;
                        count1 = 0;
                    }
                }
                if (c instanceof TomatoPlant) {
                    assertInstanceOf(TomatoPlant.class, actual[countRow][count2]);
                    count2++;
                    if (count2 == actual[0].length) {
                        countRow++;
                        count1 = 0;
                    }
                }
                if (c instanceof BeanStalk) {
                    assertInstanceOf(BeanStalk.class, actual[countRow][count3]);
                    count3++;
                    if (count3 == actual[0].length) {
                        countRow++;
                        count1 = 0;
                    }
                }
            }
        }
    }
}