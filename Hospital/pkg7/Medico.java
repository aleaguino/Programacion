package Hospital.pkg7;

/**
 *
 * @author aleag
 */
public class Medico extends Trabajador{
    private String numColegiado;
    private int numPacientes;
    private Especializacion especializacion;
    
    public Medico(){
    }

    public Medico(String numColegiado, int numPacientes, Especializacion especializacion, String nombre, String nId, int sueldo) {
        super(nombre, nId, sueldo);
        this.numColegiado = numColegiado;
        this.numPacientes = numPacientes;
        this.especializacion = especializacion;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public int getNumPacientes() {
        return numPacientes;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public void setNumPacientes(int numPacientes) {
        this.numPacientes = numPacientes;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }

    @Override
    public String toString() {  
        return super.toString()+"Medico{" + "numColegiado=" + numColegiado + ", numPacientes=" + numPacientes + ", especializacion=" + especializacion + '}';
    }

    
    }
