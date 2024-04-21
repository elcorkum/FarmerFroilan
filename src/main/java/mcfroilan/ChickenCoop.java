package mcfroilan;

public class ChickenCoop{
    private int id;
    private static int uniqueID = 0;
    public ChickenCoop(){
        uniqueID++;
        id = uniqueID;
    }
}