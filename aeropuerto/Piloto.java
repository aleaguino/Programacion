
package aeropuerto;

/**
 *
 * @author aleag
 */
public class Piloto extends Personal{
    private Rango rango;
    private int sueldo;
    private boolean internacionales;
    
    Piloto(){
    }

    public Piloto(Rango rango, int sueldo, boolean internacionales, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.rango = rango;
        this.sueldo = sueldo;
        this.internacionales = internacionales;
    }

    public Rango getRango() {
        return rango;
    }

    public int getSueldo() {
        return sueldo;
    }

    public boolean isInternacionales() {
        return internacionales;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setInternacionales(boolean internacionales) {
        this.internacionales = internacionales;
    }
    
    
}
