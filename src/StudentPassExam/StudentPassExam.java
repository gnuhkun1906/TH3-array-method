package StudentPassExam;

import java.util.Scanner;

public class StudentPassExam {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Yêu cầu dưới 30");
            }
        } while (size > 30);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i+1)+":  ");
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of students passing the exam is :" + count);
    }
}
