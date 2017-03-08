
package figurasgeometricas2;
/**
 * Clase que representa un cuadrado con sus operaciones
 * @author Anggy Arguello - Holmes ayala
 */
public class Cuadradito {
    //Atributo que contiene la coordenada X1 Y1
    private Punto punto1;
    //Atributo que contiene la coordenada X2 Y2
    private Punto punto2;
    //Atributo que contiene la coordenada X3 Y3
    private Punto punto3;
    //Atributo que contiene la coordenada X4 Y4
    private Punto punto4;
    /**
     * Constructor de la clase
     * @param punto1
     * @param punto2
     * @param punto3
     * @param punto4
     */
    public Cuadradito(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }
    /**
     * Retorna el lado AB
     * @return lado
     */
    public double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna el lado BC
     * @return lado
     */
    public double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna el lado CD
     * @return lado
     */
    public double darLado3(){
        double auxiliarX = Math.pow(punto4.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto4.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna el lado DA
     * @return lado
     */
    public double darLado4(){
        double auxiliarX = Math.pow(punto1.getX() - punto4.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto4.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorna el perimetro de un cuadrado o rectangulo
     * @return perimetro
     */
    public double darPerimetro(){
        double perimetro = darLado1() + darLado2() + darLado3() + darLado4();
        return perimetro;
    }
    /**
     * Retorna el Area de un cuadrado o rectangulo
     * @return 
     */
    public double darArea(){
        double area = darLado1() * darLado2();
        return area;
    }
    /**
     * Retorna el tipo
     * 1 cuadrado
     * 2 rectangulo
     * 3 no es cuadrado ni rectangulo
     * @return validar
     */
    public byte validarTipo() {
        byte validar;
        if(darLado1() == darLado2() && darLado1() == darLado3() && darLado1() == darLado4()){
            validar = 1;
        }
        else if(darLado1() == darLado3() && darLado2() == darLado4()){
            validar = 2;
        }
        else{
            validar = 3;
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
    /**
     * Retorna la coordenada x3 y3
     * @return punto3
     */    
    public Punto getPunto3() {
        return punto3;
    }
    /**
     * Modifica la coordenada x3 y3
     * @param punto3
     */    
    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }
    /**
     * Modifica la coordenada x4 y4
     * @param punto4
     */    
    public void setPunto4(Punto punto4) {
        this.punto3 = punto4;
    }   
}
