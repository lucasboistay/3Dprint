package math;

public class Point3D extends Matrice{

    public Point3D(double x, double y,double z){
        super(3, 1);
        double[][] table = {{x},{y},{z}};
        super.setTable(table);
    }

    public Point3D(int x, int y,int z){
        this((double)x,(double)y,(double)z);
    }

    public Point3D(){
        this((int)Math.random()*10+1,(int)Math.random()*10+1,(int)Math.random()*10+1);
    }

    //getteur

    public double getX(){
        return super.getTable()[0][0];
    }

    public double getY() {
        return super.getTable()[1][0];
    }

    public double getZ(){
        return super.getTable()[2][0];
    }

    // setteur

    public void setPosition(int x, int y, int z){
        super.setTable(0, 0, x);
        super.setTable(1, 0, y);
        super.setTable(2, 0, z);
    }

    //

    public Vecteur3D vecteurEntrePoints(Point3D p){return new Vecteur3D(p.getX() - this.getX() , p.getY() - this.getY() , p.getZ() - this.getZ());}

    public double distance(Point3D p){
        return Math.sqrt(Math.pow(this.getX() - p.getX(),2) + Math.pow(this.getY() - p.getY(),2) + Math.pow(this.getZ() - p.getZ(),2));
    }

    @Override 
    public Point3D multiplicationMatrice(Matrice m) {
        if(this.table.length != m.getTable()[0].length){
            return null;
        }

        Point3D matriceMulti = new Point3D();

        for (int i=0 ; i<m.getTable().length ; i++){
            for (int j=0 ; j<this.table[0].length ; j++){
                double total = 0;
                for (int k=0 ; k<m.getTable()[0].length ; k++ ){
                    total += m.getTable()[i][k] * this.table[k][j];
                }
                matriceMulti.setTable(i, j, total);
            }
        }
        return matriceMulti;
    }

    @Override
    public String toString() {
        return "Point : " + super.toString();
    }

    
}
