import objet.*;

public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("------- Démarrage du programme -------");

        Point p = new Point(0, 0);
        Point p2 = new Point(3, 0);

        System.out.println(p2);

        System.out.println(p.distance(p2));
    }
}    