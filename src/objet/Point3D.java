package objet;

import math.Vecteur3D;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(int x, int y,int z){
        this((double)x,(double)y,(double)z);
    }

    public Point3D(){
        this((int)Math.random()*10+1,(int)Math.random()*10+1,(int)Math.random()*10+1);
    }

    //getteur

    public double getX(){
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ(){
        return this.z;
    }

    // setteur

    public void setPosition(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //

    public Vecteur3D vecteurEntrePoints(Point3D p){return new Vecteur3D(p.getX() - this.getX() , p.getY() - this.getY() , p.getZ() - this.getZ());}

    public double distance(Point3D p){
        return Math.sqrt(Math.pow(this.x - p.getX(),2) + Math.pow(this.y - p.getY(),2) + Math.pow(this.z - p.getZ(),2));
    }

    @Override
    public String toString() {
        return "Point(" + this.x + "," + this.y + "," + this.z + ")";
    }

    
}
