/*
 * En un proyecto en el que se sigan buenas practicas, debería
 * tener las clases en un directorio dentro del proyecto e
 * importarlos al main desde ahí
 */

/**
 *
 * @author Nauzet
 */
public class Main {

    /**
     *
     * @return
     */
    public static float aleatorio() {
        float prueba = (((float) Math.random())*10000);
        prueba = (int) prueba;
        return prueba /= 100;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cono cono = new Cono(aleatorio(),aleatorio(),aleatorio(),aleatorio());
        cono.imprimir();
    }
    
}
