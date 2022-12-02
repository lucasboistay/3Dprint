package affichage;

import objet.Espace3D;
import math.Matrice;

public class Affichage {
    private static Espace3D espace;
    private static Matrice pov;

    private static final Affichage INSTANCE = new Affichage();

    private Affichage(){}

    public static Espace3D getEspace() {
        return espace;
    }

    public static void setEspace(Espace3D espace) {
        Affichage.espace = espace;
    }

    public static Matrice getPov() {
        return pov;
    }

    public static void setPov(Matrice pov) {
        Affichage.pov = pov;
    }

    public static Affichage getInstance() {
        return INSTANCE;
    }

    

}
