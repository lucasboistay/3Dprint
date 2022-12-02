package objet;

import java.util.ArrayList;

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

    //TODO Fonction appliquer matrice à un objet
    
    //To String
    @Override
    public String toString() {
        String resultat = this.nom + " (" + this.listSurface.size() + " surfaces)";
        return resultat;
    }
}
