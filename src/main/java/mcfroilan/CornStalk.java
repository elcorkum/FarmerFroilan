package mcfroilan;

public class CornStalk extends Crop{
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