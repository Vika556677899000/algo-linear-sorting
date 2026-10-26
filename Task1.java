package mnushko;

public class Task1 {
    public static int[] sort(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        int max = 5;
        int[] count = new int[max + 1];
        for (int num : arr) count[num]++;
        for (int i = 1; i <= max; i++) count[i] += count[i - 1];
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        return result;
    }
}