import math.*;

public class App {
    public static void main(String[] args) throws Exception {
        double angle = 90;
        Matrice mX = MatriceRotation3D.rotaX(angle);
        Matrice mY = MatriceRotation3D.rotaY(angle);
        Matrice mZ = MatriceRotation3D.rotaZ(angle);

        System.out.println(mX);
        System.out.println(mY);
        System.out.println(mZ);

        System.out.println("\n\nTest Objet: ");

        Point3D p1 = new Point3D(1, 0, 0);
        Point3D p2 = new Point3D(0, 0, 0);
        Point3D p3 = new Point3D(1, 1, 0);
        Point3D p4 = new Point3D(0, 1, 0);

        Point3D newP1 = (Point3D) p1.multiplicationMatrice(mZ);
        Point3D newP2 = (Point3D) p2.multiplicationMatrice(mZ);
        Point3D newP3 = (Point3D) p3.multiplicationMatrice(mZ);
        Point3D newP4 = (Point3D) p4.multiplicationMatrice(mZ);

        System.out.println(newP1);
        System.out.println(newP2);
        System.out.println(newP3);
        System.out.println(newP4);
        
    }
}