package BaiThucHanh4;

public class Circle extends Shape {
    //Khai báo thuộc tính
    protected double radius;
    protected double area;
    protected double perimeter;

    //Khai báo phương thức không tham số truyền vào
    public Circle() {
        this.radius = 1.0;
    }

    //Khai báo phương thức có tham số truyền vào
    public Circle(double radius) {
        this.radius = radius;
    }

    //Khai báo phương thức có kế thừa từ lớp cha
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    //Khởi tạo getter và setter cho radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area = Math.pow(radius, 2) * 3.14;
    }

    public double getPerimeter() {
        return perimeter = (radius * 2) * 3.14;

    }

    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of" + super.toString();
    }
}
