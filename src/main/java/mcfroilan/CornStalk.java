package mcfroilan;

public class CornStalk extends Crop{

    private int id;
    public static int uniqueID = 0;

    @Override
    public int getId() {
        return id;
    }

    public CornStalk(){
        uniqueID++;
        id = uniqueID;
    }


        public EarCorn yield (){
            EarCorn earCorn;
            if (hasBeenFertilized && hasBeenHarvested){
                earCorn = new EarCorn();
            }else {
                earCorn = null;
            }
            return earCorn;
        }
    }


