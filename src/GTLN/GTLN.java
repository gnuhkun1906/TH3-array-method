package GTLN;

import java.util.Arrays;
import java.util.Scanner;

public class GTLN {
    public static void main(String[] args) {
        int size;
        int []array;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter your size");
            size= scanner.nextInt();
            if (size>20)
                System.out.println("Phần tử trong mảng quá nhiều");
        }while (size>20);
        array=new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhâp vào giá trị của mảng:  ");
            array[i]= scanner.nextInt();
        }
        //gọi đến phương thức class của array để tìm giá trị lớn nhất ===>
//        System.out.println("đay la:" + Arrays.stream(array).max().getAsInt());

        int max=array[0];
        int index=1;
        for (int j = 0; j <array.length ; j++) {
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: "+ max +" ở vị trí " +index);
    }
}
