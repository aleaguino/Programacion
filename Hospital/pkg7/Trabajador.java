
package Hospital.pkg7;

/**
 *
 * @author aleag
 */
public class Trabajador {
    protected String nombre;
    protected String nId;
    protected int sueldo;
    
    public Trabajador(){
    }

    public Trabajador(String nombre, String nId, int sueldo) {
        this.nombre = nombre;
        this.nId = nId;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getnId() {
        return nId;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnId(String nId) {
        this.nId = nId;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", nId=" + nId + ", sueldo=" + sueldo + '}';
    }
    
    
}
