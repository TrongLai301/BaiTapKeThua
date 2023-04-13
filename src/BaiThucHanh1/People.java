package BaiThucHanh1;

public class People {
    //Khai báo thuộc tính
    protected String name;
    protected boolean gender;
    protected int age;

    //Khởi tạo phương thức không tham số truyền vào
    public People() {
        this.name = "Tên mặc định";
        this.age = 0;
        this.gender = false;
    }

    // Khởi tạo phương thức có tham số truyền vào
    public People(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Khởi tạo getter setter cho name
    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    //Khởi tạo getter setter cho age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //Khởi tạo getter setter cho gender
    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = isGender();
    }

    //Phương thức ăn
    public void eat() {
        System.out.println(name + " đang ăn...");
    }

    //Phương thức ngủ
    public void sleep() {
        System.out.println(name + " đang ngủ...");
    }

    //Phần hiển thị thông tin
    @Override
    public String toString() {
        return " A People with name: " + name + ", age: " + age + ", gender: " + (isGender() ? "Nữ" : "Nam");
    }
}
