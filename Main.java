package mnushko;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Проверка решений ===\n");
        
        int[] t1 = {5, 1, 3, 1, 5};
        System.out.println("Задача 1: " + Arrays.toString(Task1.sort(t1)));
        System.out.println("Ожидаемо: [1, 1, 3, 5, 5]\n");
        
        double[] t2 = {0.15, 0.75, 0.40, 0.05};
        System.out.println("Задача 2: " + Arrays.toString(Task2.sort(t2)));
        System.out.println("Ожидаемо: [0.05, 0.15, 0.4, 0.75]\n");
        
        int[] t3 = {9999, 12, 100, 12};
        Task3.sort(t3);
        System.out.println("Задача 3: " + Arrays.toString(t3));
        System.out.println("Ожидаемо: [12, 12, 100, 9999]");
    }
}