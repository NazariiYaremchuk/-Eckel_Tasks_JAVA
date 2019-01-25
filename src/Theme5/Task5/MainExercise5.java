package Theme5.Task5;

/**
 * Своріть клас Dog з перегруженим методом bark(). Метод повинен бути перегруженим для різних примітивних типів даних
 * з метою виводу повідомлення про гавкіт,завивання,виття, і т.д. залежно від версіх перегруженого методу.
 * Напишіть метод main() , викликаючий всі версії.
 */

public class MainExercise5 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark(8);
        dog.bark(4.5);
        dog.bark('I');

    }
}
