package bt.collection.sort.model;

import java.util.Scanner;

public class Product implements IShop{
    private int id;
    private String name;
    private double price;
    private boolean status;

    public Product() {
    }

    public Product(int id, String name, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập thông tin sản phẩm ");
        System.out.println("Nhập vào mã sp ");
        this.id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sp ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào giá sp ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập vào trạng thái ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("ID : "+this.id);
        System.out.println("Name : "+this.name);
        System.out.println("Price : "+this.price);
        System.out.println("Status : "+(this.status ? "active" : "inactive"));
    }
}
