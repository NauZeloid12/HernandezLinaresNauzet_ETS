/**
 *
 * @author Nauzet
 */
public class Circulo {
    private float radio;
    private Punto punto;
    
    public Circulo(){}
    
    public Circulo(float radio, Punto punto){
        this.radio = radio;
        this.punto = punto;
    }
    
    public void imprimir() {
        System.out.println("Circulo - radio: " + radio);
        punto.imprimir();
    }
}
