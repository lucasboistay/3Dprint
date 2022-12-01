package objet;

import java.util.ArrayList;
import math.Vecteur3D;

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
    public void ajoutePoint(Point3D p){
        this.listePoint.add(p);
    }

    public void setVecteurNormal(Vecteur3D vecteurNormal) {
        this.vecteurNormal = vecteurNormal;
    }

    /**
     * Permet de calculer le vecteur normal à cette surface
     * ATTENTION, ne fonctionne que si la surface contient dejà au moins 3 points
     */
    public void calculateNormalVecteur(){
        Point3D a = listePoint.get(0);
        Point3D b = listePoint.get(1);
        Point3D c = listePoint.get(2);
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
