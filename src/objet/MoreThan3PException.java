/** Gestion de l'exception lorsqu'il y a déjà 3 points dans une surface
 * @author Lucas BOISTAY
 */

package objet;

public class MoreThan3PException extends Exception{
    public MoreThan3PException(){
        super("Déjà 3 points dans la surface !");
    }
}
