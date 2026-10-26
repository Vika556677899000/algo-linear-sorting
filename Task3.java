package mnushko;

public class Task3 {
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) if (arr[i] > max) max = arr[i];
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            int n = arr.length;
            int[] result = new int[n];
            int[] count = new int[10];
            for (int i = 0; i < n; i++) count[(arr[i] / exp) % 10]++;
            for (int i = 1; i < 10; i++) count[i] += count[i - 1];
            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                result[count[digit] - 1] = arr[i];
                count[digit]--;
            }
            System.arraycopy(result, 0, arr, 0, n);
        }
    }
}