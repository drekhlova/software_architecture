package Homework1.Utils;

public class Angle3D {

    public int angleOnXYPlane;
    public int angleOnXZPlane;
    public int angleOnYZPlane;

    public Angle3D(int angleOnXYPlane, int angleOnXZPlane, int angleOnYZPlane) {
        this.angleOnXYPlane = angleOnXYPlane;
        this.angleOnXZPlane = angleOnXZPlane;
        this.angleOnYZPlane = angleOnYZPlane;
    }
    
    public int getAngleOnXYPlane() {
        return angleOnXYPlane;
    }
    public int getAngleOnXZPlane() {
        return angleOnXZPlane;
    }
    public int getAngleOnYZPlane() {
        return angleOnYZPlane;
    }
    public void setAngleOnXYPlane(int angleOnXYPlane) {
        this.angleOnXYPlane = angleOnXYPlane;
    }
    public void setAngleOnXZPlane(int angleOnXZPlane) {
        this.angleOnXZPlane = angleOnXZPlane;
    }
    public void setAngleOnYZPlane(int angleOnYZPlane) {
        this.angleOnYZPlane = angleOnYZPlane;
    }   
}