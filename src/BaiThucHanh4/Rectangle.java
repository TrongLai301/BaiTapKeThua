package BaiThucHanh4;

public abstract class Rectangle extends Shape {
    //Khởi tạo thuộc tính
    protected double width;
    protected double lenght;
    protected double area;
    protected double perimeter;

    //Khởi tạo phương thức không tham số truyền vào
    public Rectangle() {
        this.width = 1.0;
        this.lenght = 1.0;
    }


    //Khởi tạo phương thức có tham số truyền vào
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    //Khởi tạo phương thức có kế thừa từ lớp cha
    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }


    //Khởi tạo getter và setter cho chiều dài và chiều cao


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    //Phương thức tính diện tích

    public double getArea() {
        return area = width * lenght;
    }

    public double getPerimeter() {
        return perimeter = (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "A Circle with width= " + width + " and lengt" + lenght + ", which is a subclass of" + super.toString();
    }

    public abstract void setLength(double length);
}
