package math;

public abstract class Vecteur extends Matrice{

    Vecteur(int n){
        super(n, 1);
    }

    // Getteur
    public double[] getCoordonnee() {
        double[] coordonnee = new double[3];
        double[][] table = super.getTable();
        for (int i=0 ; i<table.length ; i++){
            coordonnee[i] = table[i][0];
        }
        return coordonnee;
    }

    // Setteur

    public void setCoordonnee(double[] coordonnee) {
        for (int i=0 ; i<coordonnee.length ; i++){
            this.setTable(i,0,coordonnee[i]);
        }
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
        double[] table = this.getCoordonnee();
        double[] newtable = new double[table.length];

        double norme = this.norme();

        for(int i=0 ; i<table.length ; i++){
            newtable[i] = table[i]/norme;
        }
        this.setCoordonnee(newtable);
    }

    //toString
    @Override
    public String toString() {
        return "Vecteur : " + super.toString();
    }

}
