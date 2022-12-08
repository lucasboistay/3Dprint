package objet;

import java.util.ArrayList;

import math.Point3D;
import math.Vecteur3D;
import math.Matrice;

public class Surface {
    private ArrayList<Point3D> listePoint;
    private final String nom;
    private Vecteur3D vecteurNormal;

    /**
     * Constructeur d'une Surface, prend un nom en entrée
     * @param nom
     */
    public Surface(String nom){
        this.nom=  nom;
        this.listePoint = new ArrayList<>();
        vecteurNormal = new Vecteur3D();
    }

    //getteur

    public ArrayList<Point3D> getList(){
        return this.listePoint;
    }

    public Vecteur3D getVecteurNormal() {
        return vecteurNormal;
    }

    //Setteur
    /**
     * Ajoute un point dans la surface
     * Attention, pas de test si le point ne fait pas partie de la surface (si déjà 3 points présents) !!
     * @param p
     */
    public void ajoutePoint(Point3D p){
        this.listePoint.add(p);
    }

    public void setVecteurNormal(Vecteur3D vecteurNormal) {
        this.vecteurNormal = vecteurNormal;
    }

    public void appliquerMatrice(Matrice m){
        for(int i=0 ; i<listePoint.size() ; i++){
            listePoint.set(i, listePoint.get(i).multiplicationMatrice(m));
        }
    }

    /**
     * Renvoie une arraylist rempli de point qui sont sur cette surface
     * @param nbParLigne Nombre de point à récupéré au carré
     * @return ArrayList de point
     */
    public ArrayList<Point3D> getPointsSurface(int nbParLigne){
        ArrayList<Point3D> listePointSurSurface = new ArrayList<>();

        //TODO getPointsSurface

        return listePointSurSurface;
    }

    /**
     * Permet de calculer le vecteur normal à cette surface
     * ATTENTION, ne fonctionne que si la surface contient dejà au moins 3 points
     */
    public void calculateNormalVecteur(){
        Point3D a = listePoint.get(0);
        Point3D b = listePoint.get(1);
        Point3D c = listePoint.get(2);

        Vecteur3D ab = a.vecteurEntrePoints(b);
        Vecteur3D cb = c.vecteurEntrePoints(b);

        Vecteur3D vNormal = ab.crossProduct(cb);
        this.vecteurNormal = vNormal;
        this.vecteurNormal.normaliser();

    }

    //toString
    @Override
    public String toString() {
        String liste = "[";
        for(Point3D p : this.listePoint){
            liste += p.toString() + ",";
        }
        liste += "]";
        return nom+liste;
    }

}
