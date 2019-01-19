package Theme5.Task6;

public class Car {
    public void drive(int i, double d) {
        System.out.println("Машина проїхала " + i + " км за " + d + " год");
    }

    public void drive(char ch, int i) {
        System.out.println("Машина '" + ch + "' проїхала за " + i + " год");
    }

    public void drive(int i, char ch) {
        System.out.println("За " + i + " год зробили машину '" + ch+"'");
    }
}
