package actividad2ProyectoJava;

public class Circulo {

    private float radio;

    public Circulo(float r) {
        this.radio = r;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float area() {
        return (float) Math.PI * radio * radio;
    }

    public void imprimir() {
        System.out.print("r=" + radio + " A=" + area());
    }
}
