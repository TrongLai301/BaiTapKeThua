package BaiThucHanh1;

public class Employee extends People {
    //Khai báo thuộc tính mới
    private String enterprise;

    //Khởi tạo phương thức không tham số
    public Employee() {
        this.enterprise = "CodeGym";
    }

    //Khởi tạo phương thức một tham số
    public Employee(String enterprise) {
        this.enterprise = enterprise;
    }

    //Khởi tạo phương thức có kế thừa từ lớp cha
    public Employee(String name, int age, boolean gender, String enterprise) {
        super(name, age, gender);
        this.enterprise = enterprise;
    }

    //Khởi tạo getter và setter cho enterprise
    public String getEnterprise(){
        return enterprise;
    }
    public void setEnterprise(String enterprise){
        this.enterprise=enterprise;
    }

    @Override
    public String toString(){
        return "A Employee work at enterprise: "+ enterprise + ", which is a subclass of "+super.toString();
    }
}
