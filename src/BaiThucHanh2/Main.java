package BaiThucHanh2;

public class Main {
    public static void main(String[] args) {
        Animal animal1 =new Animal();
        System.out.println(animal1);

        Animal animal2=new Animal(10,20);
        System.out.println(animal2);

        Cat cat1=new Cat();
        System.out.println(cat1);
        Cat cat2=new Cat(4);
        System.out.println(cat2);
        Cat cat3=new Cat(3.5,5,10);
        System.out.println(cat3);
    }
}
