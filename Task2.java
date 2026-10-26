package mnushko;
import java.util.ArrayList;
import java.util.Collections;

public class Task2 {
    @SuppressWarnings("unchecked")
    public static double[] sort(double[] arr) {
        if (arr == null || arr.length == 0) return arr;
        int n = arr.length;
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();
        for (double num : arr) {
            int index = Math.min((int) (num * n), n - 1);
            buckets[index].add(num);
        }
        double[] result = new double[n];
        int idx = 0;
        for (ArrayList<Double> bucket : buckets) {
            Collections.sort(bucket);
            for (double val : bucket) result[idx++] = val;
        }
        return result;
    }
}