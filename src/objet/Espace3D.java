package objet;

import java.util.ArrayList;
import math.Matrice;
import math.Point3D;
import math.Vecteur3D;

public class Espace3D {
    private static ArrayList<Objet3D> listeObjet;
    private static ArrayList<Vecteur3D> listeVecteur;
    private static ArrayList<Point3D> listePoint;

    private static Matrice pov;

    public static final Espace3D INSTANCE = new Espace3D();


    /**
     * Constructeur privé, singleton
     */
    private Espace3D(){
        listeObjet = new ArrayList<>();
        listeVecteur = new ArrayList<>();
        listePoint = new ArrayList<>();
    }

    // Getteur

    public static ArrayList<Objet3D> getListeObjet() {
        return listeObjet;
    }

    public static ArrayList<Point3D> getListePoint() {
        return listePoint;
    }

    public static ArrayList<Vecteur3D> getListeVecteur() {
        return listeVecteur;
    }

    public static Matrice getPov() {
        return pov;
    }

    // Setteur

    public static void addObjet(Objet3D o){
        listeObjet.add(o);
    }

    public static void addVecteur(Vecteur3D v){
        listeVecteur.add(v);
    } 

    public static void addPoint(Point3D p){
        listePoint.add(p);
    } 

    public static void setPov(Matrice pov) {
        Espace3D.pov = pov;
    }


    // To string

    @Override
    public String toString() {
        String resultat = "Espace 3D composé de " + listeObjet.size() + " objets :\n";
        for(Objet3D o : listeObjet){
            resultat += o.toString() + "\n";
        }

        return resultat;
    }

}
