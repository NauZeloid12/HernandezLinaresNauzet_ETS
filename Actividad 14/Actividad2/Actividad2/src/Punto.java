/**
 *
 * @author Nauzet
 */
public class Punto {

    private float x;
    private float y;
    
    public Punto(){}
    
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public void imprimir() {
        System.out.println("Punto - y: " + x);
        System.out.println("Punto - x: " + y);
    }
}
