package Baitap3;

public class MovablePonit extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    float x;

    public MovablePonit(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePonit(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePonit() {
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getxSpeed(), getySpeed()};
    }

    @Override
    public String toString() {
        return "x: " + getX() + ", y: " + getY() + ", speed= (xs: " + getxSpeed() + ",ys: " + getySpeed() + ")";
    }

    public MovablePonit move() {
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        //this dùng để chỉ đến đối tượng MovablePonit được khởi tạo khi chưa biết rõ tên đối tượng được tạo
        return this;
    }
    public void display() {
        System.out.println(getX());
        System.out.println(getY());
    }
}
