
package aeropuerto;

/**
 *
 * @author aleag
 */
public class Personal {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String mail;
    
    public Personal(){
    }
    
    public Personal(String nombre, String apellidos, String dni, String mail){
        
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getMail() {
        return mail;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
