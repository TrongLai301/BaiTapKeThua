package BaiThucHanh2;

public class Cat extends Animal {
    //Khởi tạo thuộc tính tuổi cho con mèo chó chết
    private double age;

    //Khỏi tạo phương thức không tham số truyền vào
    public Cat (){
        this.age=1.0;
    }

    //Khởi tạo phương thức có tham số truyền vào
    public Cat(double age){
        this.age=age;
    }
    //Khởi tạo phương thức kế thừa từ lớp cha
    public Cat(double weight, double height, double age){
        super(weight, height);
        this.age=age;
    }

    //Khởi tạo getter và setter cho tuổi
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age=age;
    }

    //Khởi tạo phương thức ăn và tiếng kêu
    public void sound(){
        System.out.println("Con mèo đang kêu Meow Meow...");
    }
    public void eat(){
        System.out.println("Con mèo đang ăn...");
    }

    //toString
    @Override
    public String toString(){
        return "A Cat with age: "+age+" which is a subclass of "+super.toString();
    }
}
