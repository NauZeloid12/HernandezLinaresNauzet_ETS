public class Main {

    /**
     *
     * @return
     */
    public static float aleatorio() {
        float prueba = (((float) Math.random()) * 10000);
        prueba = (int) prueba;
        return prueba /= 100;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cono cono = new Cono(aleatorio(), "rojo", new Circulo(aleatorio(), new Punto(aleatorio(), aleatorio())));
        cono.imprimir();
    }
}
