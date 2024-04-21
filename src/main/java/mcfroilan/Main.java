package mcfroilan;



public class Main{
    public static void main(String[] args) {
//        Farm farm = new Farm();
//       Chicken[][] chickenCoops = farm.makeChickens();
//        //System.out.println(Arrays.deepToString(farm.makeChickens()));
//        Chicken chicken1 = new Chicken();
//        Chicken chicken2 = new Chicken();
//        Chicken chicken3 = new Chicken();
//        System.out.println(chicken1.getId());
//        System.out.println(chicken2.getId());
//        System.out.println(chicken3.getId());
//        for(Chicken[] chickenCoop: chickenCoops) {
//            for(Chicken chicken: chickenCoop){
//                if(chicken != null && chicken.getId() == 13){
//                    chicken.makeNoise();
//                }
//            }
//        }
        Farm ponies = new Farm();
        Horse[][] stables = ponies.makeHorses();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        System.out.println(horse1.getId());
        System.out.println(horse2.getId());


    }
}
