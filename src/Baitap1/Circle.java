package Baitap1;

public class Circle {
    //Khai báo thuộc tính bán kính, màu sắc của hình tròn
    protected double radius;
    protected String color;
    protected double area;


    //Khởi tạo phương thức không tham số truyền vào
    public Circle() {
        this.radius = 0.0;
        this.color = "Blue";
    }

    //Khởi tạo phương thức có tham số truyền vào
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //Khởi tạo phương thức getter setter cho 2 thuộc tính trên
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area= Math.pow(radius, 2) * 3.14;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính: " + radius + ", màu: " + color + ", diện tích: " + getArea();
    }
}
