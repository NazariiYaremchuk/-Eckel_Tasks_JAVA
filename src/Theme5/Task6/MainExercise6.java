package Theme5.Task6;

/**
 * Переробіть попереднє завдання так , щоб два перегружених методи приймали два аргументи(різних типів).
 * і відрізнялись тільки порядком їх слідування в списку аргументів. Перевірте,чи працює це
 */

public class MainExercise6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive('A', 2);
        car.drive(4, 'B');
        car.drive(60, 1.5);
    }
}