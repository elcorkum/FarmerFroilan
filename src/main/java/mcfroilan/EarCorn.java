package mcfroilan;


public class EarCorn extends Edible{
    private int id;
    public static int uniqueID;
    public EarCorn(){
        uniqueID++;
        id = uniqueID;
    }
}