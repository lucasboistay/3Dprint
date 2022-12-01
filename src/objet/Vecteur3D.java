package objet;

public class Vecteur3D extends Vecteur{
    /**
     * Constructeur d'un vecteur 3D, prends les coordonnés.
     * @param x coordonné x
     * @param y coordonné y
     * @param z coordonné z
     */
    public Vecteur3D(double x, double y, double z){
        super(3);

        double[] coords = new double[]{x,y,z};

        super.setCoordonnee(coords);
    }

    @Override
    public void addVecteur(Vecteur v) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double dotProduct(Vecteur v) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Vecteur crossProduct(Vecteur v) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Vecteur copy() {
        // TODO Auto-generated method stub
        return null;
    }
}
