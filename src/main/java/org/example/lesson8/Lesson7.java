package my.hillel.studies.lesson8;

public class Lesson7 {
    public static void main(String[] args) {
      Pult papinpult=new Pult();

      lgMethod(papinpult);

//      papinpult.printInfo();
//       LG lg = new Pult();
       Samsung babkinpult = papinpult;
       LG maminpult = papinpult;

       samsungMethod(babkinpult);
       samsungMethod(papinpult);
    }

    private static void lgMethod(LG pult){
        pult.plus();
        pult.minus();
        pult.powerOn();
        pult.powerOff();
    }

    private static void samsungMethod(Samsung pult) {
        pult.samsungMethodS();
        pult.powerOffS();
    }
}
