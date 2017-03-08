
package figurasgeometricas2;

/**
 * Clase que representa un punto de coordenada en X y Y
 * @author Anggy Arguello - Holmes ayala
 */
public class Punto {
    //  Atributo que aloja la coordenada x
    private double x;
    //  Atributo que aloja la coordenada y   
    private double y;
    /**
     * Constructor de la clase que inicializa las variables
     * @param x
     * @param y 
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Retorna el valor de x de la coordenada
     * @return x
     */
    public double getX() {
        return x;
    }
    /**
     * Modifica coordenada x
     * @param x 
     */
    public void setX(double x) {
        this.x = x;
    }
    /**
     * Retorna el valor de y de la coordenada
     * @return y
     */    
    public double getY() {
        return y;
    }
    /**
     * Modifica coordenada y
     * @param y
     */    
    public void setY(double y) {
        this.y = y;
    }
}
