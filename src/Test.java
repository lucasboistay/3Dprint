import javax.print.event.PrintJobListener;
import javax.sound.midi.SysexMessage;

import objet.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Démarrage du programme -------");

        System.out.println("Test des points :");

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);

        System.out.println("On affiche le point P2 " + p2);

        System.out.println("Distance entre p et P2 " + p1.distance(p2));

        System.out.println("Test des surfaces");

        Point p3 = new Point(4, 5);

        Surface s = new Surface("S1");

        System.out.println("Affichage surface 1 : " + s);

        s.ajoutePoint(p1);
        s.ajoutePoint(p2);
        s.ajoutePoint(p3);

        System.out.println("Affichage des Points contenu dans la surface :");

        for (Point p : s.getList()){
            System.out.println(p);
        }

        System.out.println("Affichage surface 1 : " + s);
    }
}    