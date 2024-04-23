package mcfroilan;


import java.util.Arrays;

public class Farm{
    private Horse[][] stables;
    private Chicken[][] chickenCoops;
    private FarmHouse farmHouse;
    private Crop[][] field;

//    public Farm(Horse[][] stables, Chicken[][] chickenCoops, FarmHouse farmHouse, Crop[][] field){
//        this.stables = stables;
//        this.chickenCoops = chickenCoops;
//        this.farmHouse = farmHouse;
//        this.field = field;
//    }


    public Crop[][] getField() {
        return field;
    }

    public void setField(Crop[][] field) {
        this.field = field;
    }

    public Chicken[][] makeChickens() {
        chickenCoops = new Chicken[4][4];
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                if (x == 3 && y > 2) {
                    break;
                }
                chickenCoops[x][y] = new Chicken();
            }
        }
        return chickenCoops;


    }

    @Override
    public String toString() {
        return "Farm{" +
                "chickenCoops=" + Arrays.deepToString(chickenCoops) +
                '}';
    }


    public Horse[][] makeHorses() {
        Horse[][] stables = new Horse[3][4];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                if (x == 2 && y > 1) {
                    break;
                }
                stables[x][y] = new Horse();
            }
        }
        return stables;

    }

    public Crop[][] createField() {
//        Crop[][] field = new Crop[3][3];
//        for (int i = 0; i < field.length; i++) {
//            for (int y = 0; y < field[i].length; y++) {
//                field[i][y] = new Crop();
//                {
//                    @Override
//                    public Edible yield() {
//                        return null;
//                    }
//                };
//

       return field;
   }

}