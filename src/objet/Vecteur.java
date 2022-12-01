package objet;

public abstract class Vecteur {
    private double[] coordonnee;

    Vecteur(int n){
        coordonnee = new double[n];
    }

    // Getteur
    public double[] getCoordonnee() {
        return coordonnee;
    }

    // Setteur

    public void setCoordonnee(double[] coordonnee) {
        this.coordonnee = coordonnee;
    }

    // Maths

    public abstract void addVecteur(Vecteur v);

    public abstract double dotProduct(Vecteur v);

    public abstract Vecteur crossProduct(Vecteur v);

    //toString
    @Override
    public String toString() {
        String texte = "Vecteur[";

        for(double x : coordonnee){
            texte += Math.round(x*10.0)/10.0 + ",";
        }

        return texte + "]";
    }

    public abstract Vecteur copy();

}
