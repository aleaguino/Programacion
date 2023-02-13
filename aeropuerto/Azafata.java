
package aeropuerto;

import java.util.List;

/**
 *
 * @author aleag
 */
public class Azafata extends Personal{
    private int sueldo;
    private List<Idiomas> idiomas;
    
    Azafata(){
    }

    public Azafata(int sueldo, List<Idiomas> idiomas, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
        this.idiomas = idiomas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public List<Idiomas> getIdiomas() {
        return idiomas;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setIdiomas(List<Idiomas> idiomas) {
        this.idiomas = idiomas;
    }



    
    
    
    
}
