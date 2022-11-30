package objet;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //getteur

    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    // setteur

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    //

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(),2) + Math.pow(this.y - p.getY(),2) + Math.pow(this.z - p.getZ(),2));
    }

    @Override
    public String toString() {
        return "Point(" + this.x + "," + this.y + "," + this.z + ")";
    }

    
}
