package mcfroilan;
public class Tomato extends Edible {
    private int id;
    public static int uniqueID;
    public Tomato(){
        uniqueID++;
        id = uniqueID;
    }
}