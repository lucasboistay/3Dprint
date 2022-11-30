package objet;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getteur

    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // setteur

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    //

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.x - p.getX(),2) + Math.pow(this.y - p.getY(),2));
    }

    @Override
    public String toString() {
        return "Point(" + this.x + "," + this.y + ")";
    }

    
}
