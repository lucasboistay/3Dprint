package objet;

import java.util.ArrayList;

public class Objet3D {
    private ArrayList<Surface> listSurface;
    public final int nbSurface;

    public Objet3D(){
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
    
}
