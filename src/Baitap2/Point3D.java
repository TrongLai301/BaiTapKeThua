package Baitap2;

public class Point3D extends Point2D{
    protected float z=0.0f;

    public Point3D(){
        this.z=0.0f;
    }
    public Point3D(float x,float y,float z){
        super(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),getZ()};
    }
    public void Check3D(float[] array3D){
        for (int i = 0; i<array3D.length;i++){
            System.out.println(array3D[i]);
        }
    }
    @Override
    public String toString(){
        return "(x: "+getX()+",y: "+getY()+ ",z: "+getZ()+")";
    }
}
