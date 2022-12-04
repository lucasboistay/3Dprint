package objet;

import java.util.ArrayList;
import math.Point3D;
import math.Vecteur3D;
import math.Matrice;

public class Espace3D {
    private ArrayList<Objet3D> listeObjet;
    private ArrayList<Vecteur3D> listeVecteur;
    private ArrayList<Point3D> listePoint;

    /**
     * Constructeur privé, singleton
     */
    public Espace3D(){
        listeObjet = new ArrayList<>();
        listeVecteur = new ArrayList<>();
        listePoint = new ArrayList<>();
    }

    // Getteur

    public ArrayList<Objet3D> getListeObjet() {
        return listeObjet;
    }

    public ArrayList<Point3D> getListePoint() {
        return listePoint;
    }

    public ArrayList<Vecteur3D> getListeVecteur() {
        return listeVecteur;
    }


    // Setteur

    public void addObjet(Objet3D o){
        listeObjet.add(o);
    }

    public void addVecteur(Vecteur3D v){
        listeVecteur.add(v);
    } 

    public void addPoint(Point3D p){
        listePoint.add(p);
    } 

    public ArrayList<Point3D> getAllPoints(){
        ArrayList<Point3D> listeretour = new ArrayList<>();
        for(Objet3D object : listeObjet){
            for(Surface surface : object.getListSurface()){
                for(Point3D point : surface.getList()){
                    listeretour.add(point);
                }
            }
        }
        for(Point3D p : listePoint){
            listeretour.add(p);
        }
        return listeretour;
    }

    public void appliquerMatricePoint(Matrice m){
        for(int i=0 ; i<listePoint.size() ; i++){
            listePoint.set(i, listePoint.get(i).multiplicationMatrice(m));
        }
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
