import java.util.Arrays;

public class ArrayProcess {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};

        Arrays.sort(arr);

        int sum = 0;
        for (int x : arr) sum += x;

        double avg = (double) sum / arr.length;

        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
        System.out.println(avg);
    }
}
