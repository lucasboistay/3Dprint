package objet;

import java.util.ArrayList;

public class Surface {
    private ArrayList<Point> listePoint;
    private String nom;

    public Surface(String nom){
        this.nom=  nom;
        this.listePoint = new ArrayList<>();
    }

    //getteur

    public ArrayList<Point> getList(){
        return this.listePoint;
    }

    //Setteur
    public void ajoutePoint(Point p){
        this.listePoint.add(p);
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
