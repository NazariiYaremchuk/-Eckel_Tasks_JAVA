package Theme5.Task19;

public class MainExercise19 {
    static void printArrayString(Object... arrgs) {
        for (Object obj : arrgs) {
            System.out.println(obj + "");
        }
    }
   private static void probil(){
        System.out.println();
    }

    public static void main(String[] args) {
        printArrayString("Nazar","is","the","programmer");
        probil();
        printArrayString(1,2,3,4,5);
        probil();
        printArrayString("Девятнадцяте завдання","Виконано!");
        probil();
    }
}
