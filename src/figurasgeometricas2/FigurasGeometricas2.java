
package figurasgeometricas2;
import java.util.Scanner;
/**
 * Clase Principal
 * @author Anggy Arguello - Holmes ayala
 */
public class FigurasGeometricas2 {
    //  objeto de la clase Scanner
    private Scanner leer;
    //  Atributo que contiene las coordenadas X1 y Y1
    private Punto punto1;
    //  Atributo que contiene las coordenadas X2 y Y2
    private Punto punto2;
    //  Atributo que contiene las coordenadas X3 y Y3
    private Punto punto3;
    //  Atributo que contiene las coordenadas X4 y Y4
    private Punto punto4;
    //  Objeto de la clase cuadradito
    private Cuadradito cuadradito;
    //  Objeto de la clase Triangulo
    private Triangulo triangulo;
    //  Objeto de la clase Circulo
    private Circulo circulo;
    /**
     * Constructor de la clase
     */
    public FigurasGeometricas2() {
        leer = new Scanner(System.in);        
        mensajeBienvenida();
        iniciar();
    }
    /**
     * Metodo que da la bienvenida al programa
     */
    private void mensajeBienvenida(){
        System.out.println("------BIENVENIDO-----");
        System.out.println("*********************");
    }
    /**
     * Metodo que da inicio al menu de opciones
     */
    private void iniciar() {        
        while(true) {
            System.out.println("Menu principal:");
            System.out.println("1. Triangulo 2.Cuadrado 3.Circulo 4.Salir");
            byte opcion =  leer.nextByte();
            if(opcion == 1) {
                inicicarTriangulo();
            } else if(opcion == 2) {
                iniciarCuadradito();
            
            } else if(opcion == 3) {
                iniciarCirculo();
            } else if(opcion == 4) {
                break;
            } else {
                System.out.println("Numero no valido.");
            }
            
        }
    }
    /**
     * Metodo que inicia las operaciones para
     * triangulos
     */
    private void inicicarTriangulo(){
        boolean validar;
        do{
            validar = true;
            solicitarPuntosTriangulo();
            triangulo = new Triangulo(punto1, punto2, punto3);
            validar = triangulo.validarTriangulo();
            if(!validar){
                System.out.println("No es un triangulo!");
            }
        }while(!validar);
        menuTriangulo();
    }
    /**
     * Metodo que imprime el menu de opciones
     */
    private void menuTriangulo(){
        byte opcion;
        System.out.println("Opciones:");
        System.out.println("1. Perimetro  2. Area  3. Lados  4. Tipo de triangulo");
        opcion = leer.nextByte();
        resultadosTriangulo(opcion);
    }
    /**
     * Metodo que imprime los resultados de la opcion triangulo
     * @param opcion 
     */
    private void resultadosTriangulo(byte opcion){
        switch(opcion){
            case 1:
                System.out.println("Perimetro: "+triangulo.darPerimetro());
                break;
            case 2:
                System.out.println("Area: "+triangulo.darArea());
                break;
            case 3:
                System.out.println("Lado 1: "+triangulo.darLado1());
                System.out.println("Lado 2: "+triangulo.darLado2());
                System.out.println("Lado 3: "+triangulo.darLado3());
                break;
            case 4:
                System.out.println("Es un triangulo "+triangulo.darTipoTriangulo());
                break;
        }
    }
    /**
     * Metodo que solicita los puntos para el triangulo
     */
    private void solicitarPuntosTriangulo(){
        System.out.println("Puntos para el Triangulo: ");
        double x, y;
        System.out.println("Punto 1 X");
        x = leer.nextDouble();
        System.out.println("Punto 1 Y");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Punto 2 X");
        x = leer.nextDouble();
        System.out.println("Punto 2 Y");
        y = leer.nextDouble();
        punto2 = new Punto(x, y);
        System.out.println("Punto 3 X");
        x = leer.nextDouble();
        System.out.println("Punto 3 Y.");
        y = leer.nextDouble();
        punto3 = new Punto(x, y);
    }
    /**
     * Metodo que inicia las operaciones para 
     * cuadrados o rectangulos
     */
    private void iniciarCuadradito(){
        byte validar;
        do{
            solicitarPuntosCuadrado();
            cuadradito = new Cuadradito(punto1, punto2, punto3, punto4);
            validar = cuadradito.validarTipo();
            if(validar == 3){
                System.out.println("No es un cuadrado o rectangulo.");
            }
        }while(validar == 3);
        menuCuadradito();
        
    }
    /**
     * Metodo que solicita los puntos para el cuadrado
     */
    private void solicitarPuntosCuadrado(){
        System.out.println("Puntos para el cuadrado o rectangulo:");
        double x, y;
        System.out.println("Punto 1 X");
        x = leer.nextDouble();
        System.out.println("Punto 1 Y");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Punto 2 X");
        x = leer.nextDouble();
        System.out.println("Punto 2 Y");
        y = leer.nextDouble();
        punto2 = new Punto(x, y);
        System.out.println("Punto 3 X");
        x = leer.nextDouble();
        System.out.println("Punto 3 Y");
        y = leer.nextDouble();
        punto3 = new Punto(x, y);
        System.out.println("Punto 4 X");
        x = leer.nextDouble();
        System.out.println("Punto 4 Y");
        y = leer.nextDouble();
        punto4 = new Punto(x, y);
    }
    /**
     * Metodo de menu de opciones para un cuadrado o rectangulo
     */
    private void menuCuadradito(){
        boolean validar = true;
        byte opcion;
        do{
            System.out.println("Opciones:");
            System.out.println("1. Perimetro  2. Area");
            opcion = leer.nextByte();
        }while(!validar);
        resultadosCuadrado(opcion);
    }
    /**
     * Metodo que Imprime los resultados de la opcion cuadrado
     * @param opcion 
     */
    private void resultadosCuadrado(byte opcion){
        switch(opcion){
            case 1:
                System.out.println("Perimetro: "+cuadradito.darPerimetro());
                break;
            case 2:
                System.out.println("Area: "+cuadradito.darArea());
                break;
        }
    }
    /**
     * Metodo que inicia las operaciones para circulos
     */
    private void iniciarCirculo(){
        boolean validar;
        do{
            solicitarPuntosCirculo();
            circulo = new Circulo(punto1, punto2);
            validar = circulo.validarCirculo();
            if(!validar){
                System.out.println("Coordenadas no validas.");
            }
        }while(!validar);
        menuCirculo();
    }
    /**
     * Metodo que solicita los puntos para la opcion de circulo
     */
    private void solicitarPuntosCirculo(){
        System.out.println("Puntos para el Circulo: ");
        double x, y;
        System.out.println("Centro X");
        x = leer.nextDouble();
        System.out.println("Centro Y");
        y = leer.nextDouble();
        punto1 = new Punto(x, y);
        System.out.println("Punto X");
        x = leer.nextDouble();
        System.out.println("Punto Y");
        y = leer.nextDouble();
        punto2 = new Punto(x, y);
    }
    /**
     * Metodo que imprime el menu de opciones para circulo
     */
    private void menuCirculo(){
        byte opcion;
        System.out.println("Opciones:");
        System.out.println("1. Radio  2. Perimetro  3. Area");
        opcion = leer.nextByte();
        resultadosCirculo(opcion);
    }
    /**
     * Metodo que imprime los resultados de la opcion circulo
     * @param opcion
     */
    private void resultadosCirculo(byte opcion){
        switch(opcion){
            case 1:
                System.out.println("Radio: "+circulo.darRadio());
                break;
            case 2:
                System.out.println("Perimetro: "+circulo.darPerimetro());
                break;
            case 3:
                System.out.println("Area: "+circulo.darArea());
                break;
        }
    }
}
