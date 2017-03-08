
package figurasgeometricas2;

/**
 * Clase que representa un triangulo con sus operaciones
 * @author Anggy Arguello - Holmes ayala
 */
public class Triangulo {
    //  Atributo que contiene la cordenada x1 y1
    private Punto punto1;
    //  Atributo que contiene la cordenada x2 y2    
    private Punto punto2;
    //  Atributo que contiene la cordenada x3 y3        
    private Punto punto3;
    /**
     * Constuctor de la clase
     * @param punto1
     * @param punto2
     * @param punto3 
     */
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }
    /**
     * Metodo que da los resultados del triangulo
     */
    public void darResultados() {
        if(validarTriangulo()) {
            System.out.println("Lado1: " + darLado1());
            System.out.println("Lado2: " + darLado2());
            System.out.println("Lado3: " + darLado3());
            System.out.println("Perimetro: " + darPerimetro());
            System.out.println("Area: " + darArea());
        } else {
            System.out.println("No es un triangulo");
        }    
    }
    
    /**
     * Retorna verdadero si es un triangulo, Falso si es contrario
     * @return false o true
     */
    public boolean validarTriangulo() {
        double pendiente1 = (punto2.getY() - punto1.getY())/(punto2.getX() - punto1.getX());
        double pendiente2 = (punto3.getY() - punto2.getY())/(punto3.getX() - punto2.getX());
        double pendiente3 = (punto1.getY() - punto3.getY())/(punto1.getX() - punto3.getX());
        if(pendiente1 != pendiente2 && pendiente1 != pendiente3 && pendiente2 != pendiente3){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Retorma longitud de lado AB
     * @return lado
     */
    public double darLado1(){
        double auxiliarX = Math.pow(punto2.getX() - punto1.getX(), 2);
        double auxiliarY = Math.pow(punto2.getY() - punto1.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    
    /**
     * Retorma longitud de lado BC
     * @return lado
     */
    public double darLado2(){
        double auxiliarX = Math.pow(punto3.getX() - punto2.getX(), 2);
        double auxiliarY = Math.pow(punto3.getY() - punto2.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /**
     * Retorma longitud de lado CA
     * @return lado
     */
    public double darLado3(){
        double auxiliarX = Math.pow(punto1.getX() - punto3.getX(), 2);
        double auxiliarY = Math.pow(punto1.getY() - punto3.getY(), 2);
        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;
    }
    /** 
     * Metodo que retorna el perimetro del triangulo
     * @return Perimetro
     */
    public double darPerimetro() {        
        double perimetro =  darLado1() + darLado2() + darLado3();
        return perimetro;
    }
    /**
     * Metodo que retorna el area de un trianguo
     * @return  Area
     */
    public double darArea() {
        double semiperimetro = (darLado1() + darLado2() + darLado3()) / 2;
        double lado1 = semiperimetro - darLado1();
        double lado2 = semiperimetro - darLado2();
        double lado3 = semiperimetro - darLado3();
        
        double area =  Math.sqrt((semiperimetro * lado1 * lado2 * lado3));
        return area;
    }
    /**
     * Metodo que retorna el tipo de triangulo
     * @return Tipo de triangulo
     */
    public String darTipoTriangulo() {
        if((darLado1()-darLado2() > -0.3 && darLado1()-darLado2() < 0.3) && (darLado1()-darLado3() > -0.3 && darLado1()-darLado3() < 0.3) && (darLado2()-darLado3() > -0.3 && darLado2()-darLado3() < 0.3)){
            return "Equilatero.";
        }
        else if((darLado1() == darLado2()) || (darLado1() == darLado3()) || (darLado2() == darLado3())){
            return "Isosceles.";
        }
        else{
            return "Escaleno.";
        }
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
}
