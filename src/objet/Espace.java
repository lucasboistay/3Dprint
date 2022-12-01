package objet;

import java.util.ArrayList;
import math.Vecteur3D;

public class Espace {
    private static ArrayList<Objet3D> listeObjet;
    private static ArrayList<Vecteur3D> listeVecteur;
    private static ArrayList<Point> listePoint;

    public static final Espace INSTANCE = new Espace();


    /**
     * Constructeur privé, singleton
     */
    private Espace(){
        listeObjet = new ArrayList<>();
        listeVecteur = new ArrayList<>();
        listePoint = new ArrayList<>();
    }
}
