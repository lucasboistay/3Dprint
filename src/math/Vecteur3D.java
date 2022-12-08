package math;

public class Vecteur3D extends Vecteur{

    public Vecteur3D(){
        super(3);
    }

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
    public Vecteur3D addVecteur(Vecteur v) {
        if(!(v instanceof Vecteur3D)){
            System.out.println("ERREUR / Pas de la meme taille");
            return null;
        }
        Vecteur3D resultat = new Vecteur3D();
        double[] coords= new double[3];
        for(int i=0; i<3 ; i++){
            coords[i] = this.getCoordonnee()[i] + v.getCoordonnee()[i];
        }

        resultat.setCoordonnee(coords);

        return resultat;
        
    }

    @Override
    public double dotProduct(Vecteur v) {
        if(!(v instanceof Vecteur3D)){
            System.out.println("ERREUR / Pas de la meme taille");
            return 0;
        }
        double resultat = 0;
        for(int i = 0 ; i<3 ; i++){
            resultat += this.getCoordonnee()[i] * v.getCoordonnee()[i];
        }
        return resultat;
    }

    @Override
    public Vecteur3D crossProduct(Vecteur v) {
        if(!(v instanceof Vecteur3D)){
            System.out.println("ERREUR / Pas de la meme taille");
            return null;
        }
        Vecteur3D resultat = new Vecteur3D();
        double[] vfinal = new double[3];
        double[] v2 = v.getCoordonnee();
        double[] v1 = this.getCoordonnee();

        vfinal[0] = v1[1]*v2[2] - v1[2]*v2[1];
        vfinal[1] = v1[2]*v2[0] - v1[0]*v2[2];
        vfinal[2] = v1[0]*v2[1] - v1[1]*v2[0];

        resultat.setCoordonnee(vfinal);

        return resultat;
    }

    @Override 
    public Vecteur3D multiplicationMatrice(Matrice m) {
        if(this.table.length != m.getTable()[0].length){
            return null;
        }

        Vecteur3D matriceMulti = new Vecteur3D();

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

}
