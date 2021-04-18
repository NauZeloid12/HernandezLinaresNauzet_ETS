/**
 *
 * @author Nauzet
 */
public class Punto {

    /**
     * Atributo float centroX
     */
    protected float centroX;

    /**
     * Atributo float centroY
     */
    protected float centroY;
    
    /**
     * Constructor sin parametros de la clase Punto
     */
    public Punto() {
        
    }
    
    /**
     * Constructor con parametros de la clase Punto
     * @param centroX
     * @param centroY
     */
    public Punto(float centroX, float centroY) {
        this.centroX = centroX;
        this.centroY = centroY;
    }
}
