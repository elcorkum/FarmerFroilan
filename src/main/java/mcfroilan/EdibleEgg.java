package mcfroilan;


public class EdibleEgg extends Edible{
    private int id;
    public static int uniqueID = 0;

    public EdibleEgg(){
        uniqueID++;
        id = uniqueID;
    }

}