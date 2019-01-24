package Theme5.Task9Ready;

public class HelpClassToExercise9 {
    private int counter = 0;
    private String name = "Hello world";

    public HelpClassToExercise9(String s) {
        System.out.println("Конструктор із змінною String");
        name = s;
    }

    public HelpClassToExercise9(int i) {
        counter = i;
        System.out.println("Конструктор із змінною int");
        System.out.println("counter: " + counter);
    }

    public HelpClassToExercise9(String s, int i) {
        this(i);
        this.name = s;
        System.out.println("Аргументи String і int");
    }

    public HelpClassToExercise9() {
        this("hi", 47);
        System.out.println("Конструктор без параметрів");
    }

}
