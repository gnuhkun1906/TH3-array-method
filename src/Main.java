import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student");
        String inputName = scanner.nextLine();

        boolean checkExist = true;

        while (checkExist) {
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(inputName)) {
                    checkExist = false;
                    System.out.println("Position of the students in the list " + inputName + " is " + i);
                    break;
                }
            }
            if (checkExist) {
                System.out.println("Not found " + inputName + " in the list");

                System.out.println("Chưa đúng mời nhập lại");
                inputName=scanner.nextLine();
            }
        }
    }
}