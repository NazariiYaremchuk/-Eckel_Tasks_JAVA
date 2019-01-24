package Theme5.Task20;

public class MainExercise20 {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + "\t");
    }

    public static void main(String[] args) {
        printArray(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println();
        printArray("hello");
        System.out.println();
        printArray(1.21, 2.32, 3.43, 5.65);
        System.out.println();
        printArray("one", "two", "three", "four");
        printArray("a", 2, "43", 2.852);
    }
}