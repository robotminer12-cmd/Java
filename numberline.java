public class numberline {
    public static void main(String[] args) {
        int[] arr = { 5, 2, -8, 9, 5, 11, -77, 9, 3, 0 };
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println("Highest number=" + max);
        System.out.println("lowest number=" + min);
    }
}
