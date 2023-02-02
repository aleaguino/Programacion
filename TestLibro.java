
package pkg2.trimestre;

/**
 *
 * @author aleag
 */
public class TestLibro {
    
    public static void main(String[] args) {
        Libro a = new Libro("Falete y sus aventuras", "Falete", 12, 3);
        
        a.prestamo();
        System.out.println("Numero de ejemplares tras realizar el prestamo " +a.getEjemplares());
        System.out.println("Numero de prestados tras realizar el prestamo " +a.getPrestados());
        a.devolucion();
        System.out.println(a.toString());
    }
}
