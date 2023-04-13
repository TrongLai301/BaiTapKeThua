package BaiThucHanh2;

public class Animal {
    //Khởi tạo thuộc tính chiều cao và cân năng cho con vật
    protected double weight;
    protected double height;

    //Khơi tạo phương thức không tham số
    public Animal() {
        this.weight = 0.0;
        this.height = 0.0;
    }

    //Khởi tạo phương thức có tham số cân nặng và chiều cao truyền vào
    public Animal(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    //Khởi tạo getter và setter cho cân nặng và chiều cao


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Phương thức ghi đè hiển thị thông tin
    @Override
    public String toString() {
        return "A Animal with weight: " + weight + " and height: " + height;
    }
}
