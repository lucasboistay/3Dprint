package objet;

import java.util.ArrayList;

import math.Point3D;
import math.Matrice;

public class Objet3D {
    private String nom;
    private ArrayList<Surface> listSurface;
    public final int nbSurface;

    public Objet3D(String nom){
        this.nom = nom;
        listSurface = new ArrayList<>();
        nbSurface = 0;
    }

    // Getteur
    public ArrayList<Surface> getListSurface() {
        return listSurface;
    }

    //Setteur
    public void addSurface(Surface s){
        listSurface.add(s);
    }

    public void appliquerMatrice(Matrice m){
        for(Surface s : listSurface){
            s.appliquerMatrice(m);
        }
    }

    //TODO Fonction barycentre
    
    //To String
    @Override
    public String toString() {
        String resultat = this.nom + " (" + this.listSurface.size() + " surfaces)";
        return resultat;
    }
}
