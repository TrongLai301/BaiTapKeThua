package BaiThucHanh1;

public class Student extends People {
    //Khai báo thuộc tính mới cho lớp con
    protected String className;


    //Phương thức khởi tạo không tham số truyền vào
    public Student() {
        this.className = "D101_C1k14";
    }

    //Phương thức khởi tạo 1 tham số truyền vào
    public Student(String className) {
        this.className = className;
    }


    //Khởi tạo getter setter cho className
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //Phương thức khởi tạo có gọi constructor của lớp cha
    public Student(String name, int age, boolean gender, String className) {
        super(name, age, gender);
        this.className = className;
    }

    @Override
    public String toString() {
        return "A Student with class name: " + className + ", which is a subclass of " + super.toString();
    }
}
