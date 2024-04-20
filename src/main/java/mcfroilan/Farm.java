package mcfroilan;


import java.util.Arrays;

public class Farm{
    private Stable[] stables;
    private Chicken[][] chickenCoops;
    private FarmHouse farmHouse;


    public Chicken[][] makeChickens(){
        chickenCoops = new Chicken[4][4];
        for (int x = 0; x < 4; x++){
            chickenCoops[x] = new Chicken[4];
            for (int y = 0; y < 4; y++){
                if (x == 3 && y > 2){
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
}