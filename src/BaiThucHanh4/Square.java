package BaiThucHanh4;

public class Square extends Rectangle {
    //Khởi tạo phương thức không tham số truyền vào
    public Square() {

    }

    //Khởi tạo phương thức kế thừa width và length tham số truyền vào là side
    public Square(double side) {
        super(side, side);
    }

    //Khởi tạo phương thức kế thừa tham số truyền vào là side, color, filled
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLenght(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side=" + getSide() + " , which is a subclass of " + super.toString();
    }

}
