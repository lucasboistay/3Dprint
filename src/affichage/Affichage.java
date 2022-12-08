package affichage;

import java.util.ArrayList;
import java.util.Scanner;

import math.Point3D;
import objet.Espace3D;

public class Affichage {
    private static Espace3D espace;

    public static Scanner scan = new Scanner(System.in);

    private static final double K1 = 50; // Distance entre l'écran et le spectateur
    private static final double K2 = 2; // Permet de déplacer l'espace à l'avant du spectateur (si les objets sont situé en 0 par exemple)

    private static final int HEIGHT_ECRAN = 150;
    private static final int WIDTH_ECRAN = 3*HEIGHT_ECRAN; // Car la hauteur dans le terminal est environ 3x plus grande que la largeur

    private static final int AGRANDISSEMENT = 2;

    private static char[] ecran = new char[HEIGHT_ECRAN*(WIDTH_ECRAN+1)];

    private static final Affichage INSTANCE = new Affichage();

    private Affichage(){}
 
    // Setteur getteur

    public static Espace3D getEspace() {
        return espace;
    }

    public static void setEspace(Espace3D espace) {
        Affichage.espace = espace;
    }

    public static Affichage getInstance() {
        return INSTANCE;
    }

    public static void setTable(char c){
        for(int i=0 ; i<HEIGHT_ECRAN ; i++){
            for(int j=0 ; j<WIDTH_ECRAN ; j++){
                ecran[i*(WIDTH_ECRAN+1)+1 + j] = c;
            }
            ecran[i*(WIDTH_ECRAN+1)] = '\n';
        }
    }

    /**
     * Affiche sur le terminal l'espace actuel, depuis le POV
     */
    public static void affiche(){
    
        ArrayList<Point3D> listePoint = espace.getAllPoints(); // récupère tout les points de l'espace

        setTable(' ');

        for(Point3D p : listePoint){
            mettrePointSurEcran(p);
        }

        //System.out.print("\033\143"); // Clear l'écran TROP LAGGANT
        System.out.println(ecran); // Affiche l'écran

    }

    /**
     * Projette le point sur l'écran et met un caractère à cet endroit.
     * @param p Point à projeter.
     */
    public static void mettrePointSurEcran(Point3D p){
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        double newx = WIDTH_ECRAN/4;
        double newy = HEIGHT_ECRAN/2; // Centrer sur écran

        newx += AGRANDISSEMENT*(x*K1)/(z+K2); // Projetter sur l'écran et agrandir
        newy += AGRANDISSEMENT*(y*K1)/(z+K2);

        int newxint = (int) newx;
        int newyint = (int) newy;

        if(newxint < WIDTH_ECRAN/2 && newxint > 0 && newyint < HEIGHT_ECRAN && newyint > 0){
            ecran[newxint*2 + newyint*(WIDTH_ECRAN+1)] = '@';
        }
    }

}
