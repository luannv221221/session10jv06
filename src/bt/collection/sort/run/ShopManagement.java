package bt.collection.sort.run;

import bt.collection.sort.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ShopManagement {

    private static List<Product> products = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("=====================MENU========================\n" +
                    "1. Thêm mới sản phẩm\n" +
                    "2. Danh sách sản phẩm\n" +
                    "3. Sắp xếp sản phẩm theo giá tăng dần\n" +
                    "4. Sắp xếp sản phẩm theo giá giảm \n" +
                    "5. Cập nhật sản phâm\n" +
                    "6. Xóa sản phẩm\n" +
                    "7. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Product product = new Product();
                    product.inputData(scanner);
                    products.add(product);
                    break;
                case 2:
                    System.out.println("====Danh sách sản phẩm=====");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 3:
                    // sắp xếp sản phẩm theo giá tăng dần
                    products.sort(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return (int) (o1.getPrice() - o2.getPrice());
                        }
                    });
                    System.out.println("====Danh sách sản phẩm sau khi sắp xếp tăng dần theo giá =====");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 4:
                    // sắp xếp sản phẩm theo giá tăng dần
                    products.sort(new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return (int) (o2.getPrice() - o1.getPrice());
                        }
                    });
                    System.out.println("====Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá =====");
                    for (Product product1 : products) {
                        product1.displayData();
                    }
                    break;
                case 5:
                    // bước 1: nhập vào id sp cần sửa
                    System.out.println("Nhập vào id sản phẩm cần sửa");
                    int id = Integer.parseInt(scanner.nextLine());

                    // bước 2: loop duyệt qua list tìm phần tử cần sửa
                    for (Product product1 : products) {
                        if(product1.getId() == id){
                            product1.inputData(scanner);
                            break;
                        }
                    }
                    break;
                case 6:
                    // bước 1: nhập vào id sp cần xóa
                    System.out.println("Nhập vào id sản phẩm cần xóa");
                    int idDelete = Integer.parseInt(scanner.nextLine());

                    // bước 2: loop duyệt qua list tìm phần tử cần xóa
                    for (Product product1 : products) {
                        if(product1.getId() == idDelete){
                            products.remove(product1);
                            break;
                        }
                    }
                    break;
            }
        } while (true);
    }
}
