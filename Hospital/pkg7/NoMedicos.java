
package Hospital.pkg7;

/**
 *
 * @author aleag
 */
public class NoMedicos extends Trabajador {
    private TipoTrabajador tipotrabajador;
    private String areaTrabajo;
    
    public NoMedicos(){
    }

    public NoMedicos(TipoTrabajador tipotrabajador, String areaTrabajo, String nombre, String nId, int sueldo) {
        super(nombre, nId, sueldo);
        this.tipotrabajador = tipotrabajador;
        this.areaTrabajo = areaTrabajo;
    }

    public TipoTrabajador getTipotrabajador() {
        return tipotrabajador;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setTipotrabajador(TipoTrabajador tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    @Override
    public String toString() {
        return super.toString() +"NoMedicos{" + "tipotrabajador=" + tipotrabajador + ", areaTrabajo=" + areaTrabajo + '}';
    }

    
    }

