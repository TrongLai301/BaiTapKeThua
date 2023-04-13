package Baitap4;

import BaiThucHanh4.Shape;

public class Triangle extends Shape {
    protected double side1;
    protected double side2;
    protected double side3;
    public Triangle(){
        this.side1=1.0;
        this.side2=1.0;
        this.side3=1.0;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3){
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
    public boolean checkTriangle(){
        if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1){
            return true;
        }
            return false;
    }
    public double area(){
        double p= (side1+side2+side3)/2;
        return (2*Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)))/side1;
    }
    public double perimeter(){
        return side1+side2+side3;
    }
    @Override
    public String toString(){
        if(!checkTriangle()) {
            System.out.println("Không phải là tam giác");
        }
            return "Tam giác có ba cạnh: "+side1+", "+side2+", "+side3 +"\n"+
                    "Màu: "+color+", fill: "+isFilled() +"\n"+
                    "Chu vi: "+perimeter()+ "\n"+
                    "Diện tích: "+area();

    }
}
