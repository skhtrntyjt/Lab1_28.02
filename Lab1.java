import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;

public class Lab1 {

    public static void dayOfWeekIterator() {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Wednesday", "Sunday"};
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }

    public static void executeFunction(Runnable iterator, int duration) {
        long target = System.currentTimeMillis() + duration;
        while (System.currentTimeMillis() < target) {
            iterator.run();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This is day of week generator. For how long (in ms) to generate?");
        int duration = scanner.nextInt();
        executeFunction(Lab1::dayOfWeekIterator, duration);
    }
}
