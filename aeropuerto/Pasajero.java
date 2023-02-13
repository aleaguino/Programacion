
package aeropuerto;

/**
 *
 * @author aleag
 */
public class Pasajero extends Personal{
    private int numPass;
    
    Pasajero(){
    }

    public Pasajero(int numPass, String nombre, String apellidos, String dni, String mail) {
        super(nombre, apellidos, dni, mail);
        this.numPass = numPass;
    }

    public int getNumPass() {
        return numPass;
    }

    public void setNumPass(int numPass) {
        this.numPass = numPass;
    }
    
    
}
