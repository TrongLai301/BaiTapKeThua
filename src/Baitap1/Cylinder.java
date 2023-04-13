package Baitap1;

//Cylinder kế thừa Circle
public class Cylinder extends Circle {
    //Khai báo thêm thuộc tính
    private double height;
    protected double perimeter;

    //Khởi tạo phương thức không tham số truyền vào
    public Cylinder() {
        this.height = 0.0;
    }

    //Khởi tạo phương thức có tham số truyền vào
    public Cylinder(double height) {
        this.height = height;
    }

    //Khởi tạo phương thức có kế thừa
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    //Khởi tạo phương thức getter setter cho thuộc tính trên
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Khởi tạo phương thức tính chu vi
    public double getPerimeter() {
        return perimeter = 2 * super.radius * 3.14;
    }

    @Override
    public String toString() {
        return "Hình trụ được kế thừa từ " + super.toString() + ", có chu vi là: " + getPerimeter();
    }
}
