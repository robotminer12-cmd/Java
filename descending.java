public class descending {
    public static void main(String[] args) {

        int[] arr = { 45, 76, 87, 34, 65, 23, 98, 54, 55, 10, 77, 44 };
        int n = arr.length;

        // Selection sort for descending order
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        // Printing sorted array
        System.out.print("Output: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}