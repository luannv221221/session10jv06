package exception;

import java.util.Scanner;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Nhập vào số nguyên bất kỳ ");
                int num = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException exception){
                System.err.println("Phai la so");
            }
        } while (true);


    }
}
