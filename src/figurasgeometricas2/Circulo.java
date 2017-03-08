
package figurasgeometricas2;

/**
 * Clase que representa un circulo con sus operaciones
 * @author Anggy Arguello - Holmes ayala
 */
public class Circulo {
    //Atributo que guarda las coordenadas X1 y Y1
    private Punto punto1;
    //Atributo que guarda las coordenadas X2 y Y2
    private Punto punto2;
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2 
     */
    public Circulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }
    /**
     * Retorna el radio de un circulo
     * @return radio
     */
    public double darRadio(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double radio = Math.sqrt(auxiliarX +  auxiliarY);
        return radio;
    }
    /**
     * Retorna el perimetro de un circulo
     * @return perimetro
     */
    public double darPerimetro(){
        double perimetro = 2 * darRadio() * Math.PI;
        return perimetro;
    }
    /**
     * Retorna el Area de un circulo
     * @return area
     */
    public double darArea(){
        double area = Math.PI * Math.pow(darRadio(), 2);
        return area;
    }
    /**
     * Retorna true si las coordenadas son validas, de lo contrario false
     * @return validar
     */
    public boolean validarCirculo(){
        boolean validar = true;
        if(punto1.getX() == punto2.getX() && punto1.getY() == punto2.getY()){
            validar = false;
        }
        return validar;
    }
    /**
     * Retorna la coordenada x1 y1
     * @return punto1
     */
    public Punto getPunto1() {
        return punto1;
    }
    /**
     * Modifica la coordenada x1 y1
     * @param punto1 
     */
    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }
    /**
     * Retorna la coordenada x2 y2
     * @return punto2
     */    
    public Punto getPunto2() {
        return punto2;
    }
    /**
     * Modifica la coordenada x2 y2
     * @param punto2
     */    
    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }
}
