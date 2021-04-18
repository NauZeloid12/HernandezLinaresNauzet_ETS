/**
 *
 * @author Nauzet
 */
public class Circulo extends Punto {

    /**
     * Atributo float radio
     */
    protected float radio;
    
    /**
     * Constructor sin parametros de la clase Circulo
     */
    public Circulo() {    
    }
    
    /**
     * Constructor con parametros de la clase Circulo
     * @param radio
     * @param centroX
     * @param centroY
     */
    public Circulo(float radio, float centroX, float centroY) {
        super(centroX,centroY);
        this.radio = radio;
    }
}
