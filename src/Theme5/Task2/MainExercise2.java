package Theme5.Task2;

/**
 * Створіть клас з полем String,ініціалізованим в точці оприділення,та іншим полем , ініціалізованим конструктором.
 * Яка різниця в цих двох підходах
 */

public class MainExercise2 {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.setFieldA("I am cool");
        System.out.println("First\t" + testClass.getFieldA());

        TestClass newTestClass = new TestClass();

        System.out.println("Second\t" + testClass.getFieldB());
    }
}
