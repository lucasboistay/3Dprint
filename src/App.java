import affichage.*;
import math.*;
import objet.*;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        double angle = 5;
        Matrice mX = MatriceRotation3D.rotaX(angle);
        Matrice mY = MatriceRotation3D.rotaY(angle);
        Matrice mZ = MatriceRotation3D.rotaZ(angle);

        System.out.println(mX);
        System.out.println(mY);
        System.out.println(mZ);

        System.out.println("\n\nTest Objet: ");

        Point3D p000 = new Point3D(0, 0, 0);
        Point3D p001 = new Point3D(0, 0, 1);
        Point3D p010 = new Point3D(0, 1, 0);
        Point3D p011 = new Point3D(0, 1, 1);

        Point3D p100 = new Point3D(1, 0, 0);
        Point3D p101 = new Point3D(1, 0, 1);
        Point3D p110 = new Point3D(1, 1, 0);
        Point3D p111 = new Point3D(1, 1, 1);

        Espace3D espace = new Espace3D();

        espace.addPoint(p000);
        espace.addPoint(p001);
        espace.addPoint(p010);
        espace.addPoint(p011);

        espace.addPoint(p100);
        espace.addPoint(p101);
        espace.addPoint(p110);
        espace.addPoint(p111);

        System.out.println(espace);

        // Ajout de l'espace dans l'affichage

        Affichage.setEspace(espace);

        Affichage.affiche();

        for(int i=0 ; i<100 ; i++){
            espace.appliquerMatricePoint(mX);

            Affichage.affiche();
            TimeUnit.MILLISECONDS.sleep(10);
        }
    }
}