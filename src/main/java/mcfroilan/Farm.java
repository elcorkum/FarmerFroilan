package mcfroilan;


import java.util.Arrays;

public class Farm{
    private Stable[] stables;
    private Chicken[][] chickenCoops;
    private FarmHouse farmHouse;


    public Chicken[][] makeChickens(){
        chickenCoops = new Chicken[4][4];
        for (int x = 0; x < 4; x++){
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
    public void makeHorses(int numHorses, int numStables){
        int horses;
        int stable;

        Stable[] stables = new Stable[numStables];

        int horsesPerStable = numHorses / numStables;

        int remainingHorses = numHorses;
        for (int i = 0; i < numStables; i++) {
            int horsesForThisStable;
            if (i == numStables - 1) {
                horsesForThisStable = remainingHorses;
            } else {
                horsesForThisStable = horsesPerStable;
            }
            System.out.println("Stable " + (i + 1) + ": " + horsesForThisStable + " horses");
            remainingHorses -= horsesForThisStable;
        }
    }
}