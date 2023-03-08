package GTNN;

public class Minvalue {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 5, 6, 8, 10};
        int index = minElement(array);
        System.out.println("The smallest element in the array is : " + array[index]);
    }

    public static int minElement(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
