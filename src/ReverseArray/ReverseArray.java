package ReverseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("The size quá lớn , nhập dưới 20 thôi nha");
        } while (size > 20);
        arr = new int[size];
        int[] arrReverse = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
//            System.out.println(arr[i] + "\t");
        }
        for (int j = arr.length-1; j>=0 ; j--) {
            arrReverse[j] = arr[size-1-j];
        }
        System.out.println("Mảng đảo ngược là : " + Arrays.toString(arrReverse));
    }
}
