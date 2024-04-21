package mcfroilan;


public class EdibleEgg extends Edible {
    private int id = 0;
    public static int uniqueID;

    public EdibleEgg() {
        uniqueID++;
        id = uniqueID;
    }
}