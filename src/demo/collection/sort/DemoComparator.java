package demo.collection.sort;

import java.util.*;

public class DemoComparator {
    /*
    * Sắp xếp với Comparator
    * Sử dụng phương thức sort của collections để sắp xếp
    * Khởi tạo đối tượng Comparator
    * Cài đặt sắp xếp với phuowngg thức compare của đối tượng Comparator
    *
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Category> categories = new ArrayList<>();
        Category category1 = new Category(2,"Ao");
        Category category2 = new Category(1,"Quan");
        Category category3 = new Category(3,"Mu");
        Category category4 = new Category(4,"Giay");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        categories.add(category4);
        do {
            System.out.println("1. Hiển thị danh sách ");
            System.out.println("2. Sắp xếp danh sách danh mục theo id tăng dần");
            System.out.println("3. Sắp xếp danh sách danh mục theo tên giảm dần");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (Category category : categories) {
                        System.out.println("==========================");
                        System.out.println("ID : "+category.getId());
                        System.out.println("Name: "+category.getCategoryName());
                    }
                    break;
                case 2:
                    // sắp xếp danh mục theo id tăng dần
                    categories.sort(new Comparator<Category>() {
                        @Override
                        public int compare(Category o1, Category o2) {
                            return o1.getId() - o2.getId();
                        }
                    });

                    System.out.println("Sau khi sắp xếp tăng dần ");
                    for (Category category : categories) {
                        System.out.println("==========================");
                        System.out.println("ID : "+category.getId());
                        System.out.println("Name: "+category.getCategoryName());
                    }

                    break;
                case 3:
                    // sắp xếp danh mục theo tên giảm dần
                    categories.sort(new Comparator<Category>() {
                        @Override
                        public int compare(Category o1, Category o2) {
                            return o2.getCategoryName().compareTo(o1.getCategoryName());
                        }
                    });
                    System.out.println("Sau khi sắp xếp tên giảm dần ");
                    for (Category category : categories) {
                        System.out.println("==========================");
                        System.out.println("ID : "+category.getId());
                        System.out.println("Name: "+category.getCategoryName());
                    }
                    break;
            }
        } while (true);

    }
}
