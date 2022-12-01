import objet.*;
import math.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Démarrage du programme -------");

        System.out.println("Test des points :");

        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(3, 0, 3);

        System.out.println("On affiche le point P2 " + p2);

        System.out.println("Distance entre p et P2 " + p1.distance(p2));

        System.out.println("\n\nTest des surfaces");

        Point p3 = new Point(4, 5, 6);

        Surface s = new Surface("S1");

        System.out.println("Affichage surface 1 : " + s);

        s.ajoutePoint(p1);
        s.ajoutePoint(p2);
        s.ajoutePoint(p3);

        System.out.println("Affichage des Points contenu dans la surface :");

        for (Point p : s.getList()){
            System.out.println(p);
        }

        System.out.println("\n\nTest des Matrices :");

        Matrice m1 = new Matrice(5,5);

        m1.setAllTable(3);
        System.out.println(m1);

        Matrice m2 = m1.copy();


        System.out.println(m2);

        m2.setAllTable(5);
        m2.setDiagonale(3);
        System.out.println(m2);

        Matrice m3 = new Matrice(5,2);

        m3.setAllTable(2);
        System.out.println("M3 : " + m3);

        m2.additionMatrice(m1);
        System.out.println(m2);

        m2.additionMatrice(m3);
        System.out.println("M2 : " + m2);

        // M2 pas modifié car pas d'addition possible

        System.out.println("Affichage Multiplication m3 et m2 : ");

        m3.multiplicationMatrice(m2);
        System.out.println(m3);

        // M3 pas modifié car pas de multiplication possible

        System.out.println("Affichage Multiplication m2 et m3 : ");

        m2.multiplicationMatrice(m3);
        System.out.println(m2);

        // Affiche bien M2 x M3

        System.out.println("\n\nTest determinant ");
        Matrice m01 = new Matrice(2);
        Matrice m02 = new Matrice(3);
        Matrice m03 = new Matrice(4);

        m01.setDiagonale(5);
        m02.setAleaInt(-10, 10);
        m03.setAleaInt(-10, 10);

        System.out.println(m01);
        System.out.println(m02);
        System.out.println(m03);

        System.out.println(m01.determinantCarre());
        System.out.println(m02.determinantCarre());
        System.out.println(m03.determinantCarre());
    }
}    