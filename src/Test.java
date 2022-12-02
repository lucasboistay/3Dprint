import objet.*;
import math.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Démarrage du programme -------");

        System.out.println("Test des points :");

        Point3D p1 = new Point3D(0, 0, 0);
        Point3D p2 = new Point3D(3, 0, 3);

        System.out.println("On affiche le point P2 " + p2);

        System.out.println("Distance entre p et P2 " + p1.distance(p2));

        System.out.println("\n\nTest des surfaces");

        Point3D p3 = new Point3D(4, 5, 6);

        Surface s = new Surface("S1");

        System.out.println("Affichage surface 1 : " + s);

        s.ajoutePoint(p1);
        s.ajoutePoint(p2);
        s.ajoutePoint(p3);

        System.out.println("Affichage des Points contenu dans la surface :");

        for (Point3D p : s.getList()){
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

        Matrice mAlea1 = new Matrice(3);
        Matrice mAlea2 = new Matrice(3);

        mAlea1.setAleaInt(-10, 10);
        System.out.println("MAlea1 : " + mAlea1);
        mAlea2.setAleaInt(-10, 10);
        System.out.println("MAlea2 : " + mAlea2);

        System.out.println("MAlea2*MAlea1 : " + mAlea1.multiplicationMatrice(mAlea2));


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

        System.out.println("\n\nTest Vecteur : ");

        Vecteur3D v1 = new Vecteur3D(2, 1, 3);
        System.out.println(v1);
        Vecteur3D v2 = new Vecteur3D(0, 7, 2);
        System.out.println(v2);

        System.out.println("Addition v1 et v2 : " + v1.addVecteur(v2));
        System.out.println("DotProduct v1 et v2 : " + v1.dotProduct(v2));
        System.out.println("CrossProduct v1 et v2 : " + v1.crossProduct(v2));
        System.out.println("Norme de v1 = " + v1.norme());

        System.out.println("\n\nTest Objet: ");

        Point3D p000 = new Point3D(0, 0, 0);
        Point3D p001 = new Point3D(0, 0, 1);
        Point3D p010 = new Point3D(0, 1, 0);
        Point3D p011 = new Point3D(0, 1, 1);

        Point3D p100 = new Point3D(1, 0, 0);
        Point3D p101 = new Point3D(1, 0, 1);
        Point3D p110 = new Point3D(1, 1, 0);
        Point3D p111 = new Point3D(1, 1, 1);

        Surface sBas = new Surface("Dessous");
        Surface sHaut = new Surface("Dessus");
        Surface sGauche = new Surface("Gauche");
        Surface sDroit = new Surface("Droite");
        Surface sAvant = new Surface("Devant");
        Surface sArriere = new Surface("Derrière");

        sBas.ajoutePoint(p000); // z = 0
        sBas.ajoutePoint(p010);
        sBas.ajoutePoint(p100);
        sBas.ajoutePoint(p110);

        sHaut.ajoutePoint(p111); // z = 1
        sHaut.ajoutePoint(p001);
        sHaut.ajoutePoint(p011);
        sHaut.ajoutePoint(p101);

        sGauche.ajoutePoint(p000); // x = 0
        sGauche.ajoutePoint(p001);
        sGauche.ajoutePoint(p010);
        sGauche.ajoutePoint(p011);

        sDroit.ajoutePoint(p100); // x = 1
        sDroit.ajoutePoint(p101);
        sDroit.ajoutePoint(p110);
        sDroit.ajoutePoint(p100);
        
        sAvant.ajoutePoint(p010); //y = 1
        sAvant.ajoutePoint(p110);
        sAvant.ajoutePoint(p011);
        sAvant.ajoutePoint(p111);

        sArriere.ajoutePoint(p000); //y = 1
        sArriere.ajoutePoint(p100);
        sArriere.ajoutePoint(p001);
        sArriere.ajoutePoint(p101);

        Objet3D cube = new Objet3D("Cube");

        cube.addSurface(sArriere);
        cube.addSurface(sAvant);
        cube.addSurface(sGauche);
        cube.addSurface(sDroit);
        cube.addSurface(sHaut);
        cube.addSurface(sBas);

        Espace3D espace = Espace3D.INSTANCE;
        Espace3D.addObjet(cube);

        System.out.println(espace);
        
    }
}    