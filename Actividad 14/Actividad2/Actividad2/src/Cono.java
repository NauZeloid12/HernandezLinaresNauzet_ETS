/**
 *
 * @author Nauzet
 */
public class Cono {
    private float altura;
    private String color;
    private Circulo circulo;
    
    public Cono(){}
    
    public Cono(float altura, String color, Circulo circulo){
        this.altura = altura;
        this.color = color;
        this.circulo = circulo;
    }
    
    public void imprimir() {
        System.out.println("Cono - altura: " + altura);
        System.out.println("Cono - color: " + color);
        circulo.imprimir();
    }
}
