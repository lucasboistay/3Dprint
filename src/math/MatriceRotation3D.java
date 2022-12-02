package math;

public class MatriceRotation3D extends Matrice {
    private MatriceRotation3D(int x){
        super(x);
    }

    /**
     * Renvoie la matrice de rotation 3D autour du Vecteur3D vecteur d'un angle angle.
     * @param vecteur Vecteur unitaire autour duquel tourner
     * @return la matrice de rotation
     */
    public static Matrice rotaVecteur(Vecteur3D vecteur, double angle){
        //TODO Méthode rotaVecteur
        return null;
    }

    /**
     * Renvoie la matrice de rotation 3D autour de l'axe x
     * @param angle en degré
     * @return
     */
    public static Matrice rotaX(double angle){
        Matrice rotaX = new Matrice(3);
        angle = angle*Math.PI/180;
        double[][] tableau = {{1,0,0},{0,Math.cos(angle), -Math.sin(angle)},{0,Math.sin(angle),Math.cos(angle)}};
        rotaX.setTable(tableau);

        return rotaX;
    }

    /**
     * Renvoie la matrice de rotation 3D autour de l'axe y
     * @param angle en degré
     * @return
     */
    public static Matrice rotaY(double angle){
        Matrice rotaX = new Matrice(3);
        angle = angle*Math.PI/180;
        double[][] tableau = {{Math.cos(angle),0,Math.sin(angle)},{0,1,0},{-Math.sin(angle),0,Math.cos(angle)}};
        rotaX.setTable(tableau);

        return rotaX;
    }

    /**
     * Renvoie la matrice de rotation 3D autour de l'axe z
     * @param angle en degré
     * @return
     */
    public static Matrice rotaZ(double angle){
        Matrice rotaX = new Matrice(3);
        angle = angle*Math.PI/180;
        double[][] tableau = {{Math.cos(angle),-Math.sin(angle),0},{Math.sin(angle),Math.cos(angle),0},{0,0,1}};
        rotaX.setTable(tableau);

        return rotaX;
    }


}
