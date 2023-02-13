
package aeropuerto;

/**
 *
 * @author aleag
 */
public class Trabajadores extends Personal{
    private int sueldo;
    
    
    Trabajadores(){
    }

    public Trabajadores(int sueldo, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
