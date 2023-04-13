package BaiThucHanh4;

public class Shape {
    //Khai báo thuộc tính
    protected String color;
    protected boolean filled;

    //Khai báo phương thức không tham số truyền vào
    public Shape() {
        this.color = "Green";
        this.filled = true;
    }

    //Khai báo phương thức có tham số truyền vào
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    //Khai báo getter và setter cho color

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Khai báo getter và setter cho filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Ghi đè phương thức cho hiển thị thông tin
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (isFilled() ? "filled" : "not filled");
    }
}
