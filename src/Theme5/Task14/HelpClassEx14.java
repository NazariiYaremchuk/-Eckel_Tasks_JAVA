package Theme5.Task14;

public class HelpClassEx14 {

    private static String first = "Hello world";
    private static String second;


    static {
        second = "I love Lviv";
    }

    static void helpFuncrionEx14() {
        System.out.println(first + "  first obj");
        System.out.println(second + "  second obj");
    }
}
