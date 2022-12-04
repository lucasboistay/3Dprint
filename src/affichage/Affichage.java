package affichage;

import java.util.ArrayList;
import java.util.Scanner;

import math.Point3D;
import objet.Espace3D;

public class Affichage {
    private static Espace3D espace;

    public static Scanner scan = new Scanner(System.in);

    private static final double K1 = 100; // Distance entre l'écran et le spectateur
    private static final double K2 = 3; // Permet de déplacer l'espace à l'avant du spectateur (si les objets sont situé en 0 par exemple)

    private static final int HEIGHT_ECRAN = 150;
    private static final int WIDTH_ECRAN = 200;

    private static String[][] ecran = new String[HEIGHT_ECRAN][WIDTH_ECRAN];

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

    /**
     * Affiche sur le terminal l'espace actuel, depuis le POV
     */
    public static void affiche(){
    
        ArrayList<Point3D> listePoint = espace.getAllPoints(); // récupère tout les points de l'espace

        for(int i=0 ; i<HEIGHT_ECRAN ; i++){ // Met un vide sur tout les caractère de l'écrans.
            for(int j=0 ; j<WIDTH_ECRAN ; j++){
                ecran[i][j] = "  ";
            }
        }

        for(Point3D p : listePoint){ // Place un @ sur tout les points de l'écran
            mettrePointSurEcran(p);;
        }   

        String affichage = "";
        for(String[] i : ecran){ // Stock les valeurs dans affichage
            for(String c : i){
                affichage += c;
            }
            affichage += "\n";
        }

        System.out.print("\033\143"); // Clear l'écran
        System.out.println(affichage); // Affiche l'écran


    }

    /**
     * Projette le point sur l'écran et met un caractère à cet endroit.
     * @param p Point à projeter.
     */
    public static void mettrePointSurEcran(Point3D p){
        double x = p.getX();
        double y = p.getY();
        double z = p.getZ();

        double newx = (x*K1)/(z+K2) + HEIGHT_ECRAN/2; // Projetter sur l'écran et le centrer
        double newy = (y*K1)/(z+K2) + WIDTH_ECRAN/2;

        if(newx < HEIGHT_ECRAN && newx > 0 && newy < WIDTH_ECRAN && newy > 0){
            ecran[(int) newx][(int) newy] = "@";
        }
    }

}
