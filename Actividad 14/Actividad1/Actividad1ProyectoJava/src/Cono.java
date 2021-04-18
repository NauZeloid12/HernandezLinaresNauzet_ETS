/**
 * La clase principal que hereda de la clase Circulo,
 * que a su vez hereda de la clase Punto
 * @author Nauzet
 */
public class Cono extends Circulo {

    /**
     * Atributo float radio
     */
    protected float altura;

    /**
     * Constructor sin parametros de la clase Cono
     */
    public Cono() {
        
    }
    
    /**
     * Constructor con parametros de la clase Cono
     * @param altura
     * @param radio
     * @param centroX
     * @param centroY
     */
    public Cono(float altura, float radio, float centroX, float centroY) {
        super(radio,centroX,centroY);
        this.altura = altura;
    }
    
    /**
     * Método que imprime todos los atrbutos de la clase Cono,
     * Imprimiendo el nombre del atributo y su valor.
     * 
     * Recordemos que salvo altura, los demás atributos son
     * heredados de la clase Circulo y Punto
     */
    public void imprimir() {
        System.out.println("Atributos de Cono:");
        System.out.println("centroX = " + centroX);
        System.out.println("centroY = " + centroY);
        System.out.println("radio = " + radio);
        System.out.println("altura = " + altura);
    }
}
