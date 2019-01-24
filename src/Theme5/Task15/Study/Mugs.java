package Theme5.Task15.Study;

public class Mugs {
    Mug mag1;
    Mug mag2;
    {
        mag1 = new Mug(1);
        mag2 = new Mug(2);
        System.out.println("mug1 & mug2 done");
    }
    Mugs(){
        System.out.println("Mugs()");
    }
    Mugs(int i){
        System.out.println("Mugs(int)");
    }
}
