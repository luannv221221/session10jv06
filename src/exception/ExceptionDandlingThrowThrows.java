package exception;

import java.util.Scanner;

public class ExceptionDandlingThrowThrows {
    public static void main(String[] args) {
        System.out.println("Bat dau chương trình ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất ");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số thứ hai ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int result = divide(firstNumber,secondNumber);
        System.out.println(result);
        System.out.println("Kết thúc chương trình ");
    }

    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException{
        if(secondNumber == 0){
            // ném ra 1 ngoại lệ
            throw new ArithmeticException("Lỗi chia cho số 0");
        }
        return firstNumber/secondNumber;
    }
}
