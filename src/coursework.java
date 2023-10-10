public class coursework {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        reverseArray(originalArray);
        int lenght = originalArray.length;
        for(int i = 0; i < lenght; i++) {
            System.out.print(originalArray[i] + " ");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
