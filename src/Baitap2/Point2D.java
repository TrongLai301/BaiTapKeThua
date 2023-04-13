package Baitap2;

public class Point2D {
    //Khai báo thuộc tính
    protected float x=0.0f;
    protected float y=0.0f;
    //Khởi tạo phương thức không tham số truyền vào
    public Point2D(){
        this.x=0.0f;
        this.y=0.0f;
    }
    //Khởi tạo phương thức có tham số truyền vào
    public Point2D(float x, float y){
        this.x=x;
        this.y=y;
    }

    //Khởi tạo phương thức getter setter cho x,y
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new float[] {getX(), getY()};
    }
    public void Check2D(float[] array2D){
        for (int i = 0; i<array2D.length;i++){
            System.out.println(array2D[i]);
        }
    }
    @Override
    public String toString(){
        return "(x: "+getX()+",y: "+getY()+")";
    }

}
