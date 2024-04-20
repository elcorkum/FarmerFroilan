package mcfroilan;

public class Field{
    private CropRow[] cropRows;
    public CropRow[] getCropRows() {
        return cropRows;
    }


    public Field (){
        cropRows=new CropRow[5];
        for (int i=0;i< cropRows.length;i++){
            cropRows[i]=new CropRow(10);
        }
    }


}