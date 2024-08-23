package exception;

import java.util.Scanner;

public class ExceptionHandingWithTryCatch {
    public static void main(String[] args) {
        /*
        * try{
        *       // khối lệnh có thể xẩy ra lỗi
        * } catch(Exception ex){
        *       // khổi lệnh xử lý ngoại lệ
        * } finally{
        *       // khối lệnh luôn được thực hiện  có exception hay ko
        * }
        * */
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Bắt đầu chương trình ");
            System.out.println("Chia 2 số ");
            System.out.println("Nhap tu so ");
            int num1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap mau so ");
            int num2 = Integer.parseInt(scanner.nextLine());
            int result = num1 /  num2;
            System.out.println("kết qua la "+result);
        } catch (NumberFormatException exception){
            System.err.println("Không phải là số rồi bạn ");
        }catch (Exception e){
            System.err.println("Ko thể chia cho số 0");
        } finally {
            System.out.println("Kết thúc chương trình ");
        }

    }
}
