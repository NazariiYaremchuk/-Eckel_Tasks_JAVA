package Theme5.Task22;

import Theme5.Task21.Money;

public class MainExercise22 {
    Money country;

    public MainExercise22(Money country) {
        this.country = country;
    }

    public void describe() {
        switch (country) {
            case UAN:
                System.out.println("Ukraine");
                break;
            case EURO:
                System.out.println("Europe");
                break;
            case POUND:
                System.out.println("Britain");
                break;
            case RUBLE:
                System.out.println("Russia");
                break;
            case ZLOTY:
                System.out.println("Poland");
            case DOLLAR:
                System.out.println("USA");
                break;
            default:
                System.out.println("It's all :)");
        }
    }

    public static void main(String[] args) {
        MainExercise22 a = new MainExercise22(Money.DOLLAR);
        MainExercise22 b = new MainExercise22(Money.EURO);
        MainExercise22 c = new MainExercise22(Money.UAN);

        a.describe();
        b.describe();
        c.describe();
    }

}
