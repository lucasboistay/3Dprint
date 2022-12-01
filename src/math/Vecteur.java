package math;

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

    /**
     * Renvoie un vecteur égal à l'addition entre this et v
     * @param v vecteur v de meme taille que this
     * @return addition des deux vecteur
     */
    public abstract Vecteur addVecteur(Vecteur v);

    /**
     * Renvoie un vecteur égal au produit scalaire entre this et v
     * @param v vecteur v de meme taille que this
     * @return valeur du scalaire des deux vecteur
     */
    public abstract double dotProduct(Vecteur v);

    /**
     * Renvoie un vecteur égal au produit vectoriel entre this et v
     * @param v vecteur v de meme taille que this
     * @return vectoriel des deux vecteur
     */
    public abstract Vecteur crossProduct(Vecteur v);

    public double norme(){
        return this.dotProduct(this);
    }

    public void normaliser(){
        //TODO
    }
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
