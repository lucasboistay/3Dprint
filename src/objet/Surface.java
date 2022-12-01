package objet;

import java.util.ArrayList;
import math.Vecteur3D;

public class Surface {
    private ArrayList<Point> listePoint;
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

    public ArrayList<Point> getList(){
        return this.listePoint;
    }

    public Vecteur3D getVecteurNormal() {
        return vecteurNormal;
    }

    //Setteur
    public void ajoutePoint(Point p){
        this.listePoint.add(p);
    }

    public void setVecteurNormal(Vecteur3D vecteurNormal) {
        this.vecteurNormal = vecteurNormal;
    }

    //toString
    @Override
    public String toString() {
        String liste = "[";
        for(Point p : this.listePoint){
            liste += p.toString() + ",";
        }
        liste += "]";
        return nom+liste;
    }

}
