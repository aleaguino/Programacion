
package Llamadas;
import java.time.Duration;
 import java.time.LocalDateTime;
/**
 *
 * @author aleag
 */

public class Llamada implements Comparable<Llamada> {

    private String telefonoCliente;
    private String telefonoInterlocutor;
    private boolean saliente;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private ZonaInterlocutor zona;
    
    private static final int[] TARIFAS = {10, 15, 20, 25, 30};
    
    public Llamada(String telefonoCliente, String telefonoInterlocutor, boolean saliente,
                   LocalDateTime inicio, LocalDateTime fin, ZonaInterlocutor zona) {
        this.telefonoCliente = telefonoCliente;
        this.telefonoInterlocutor = telefonoInterlocutor;
        this.saliente = saliente;
        this.inicio = inicio;
        this.fin = fin;
        this.zona = zona;
    }
    
    public int getDuracion() {
    long duracionEnMinutos = Duration.between(inicio, fin).toMinutes();
    return (int) duracionEnMinutos;
}

    
    public double getCoste() {
        if (!saliente) {
            return 0;
        }
        int duracionMinutos = getDuracion();
        double tarifa = TARIFAS[zona.ordinal()];
        return duracionMinutos * tarifa / 100.0;
    }
    
    public enum ZonaInterlocutor {
    ZONA_A, ZONA_B, ZONA_C, ZONA_D, ZONA_E
}
    
    @Override
    public String toString() {
        int duracion = getDuracion();
        double coste = getCoste();
        return String.format("Llamada de %s a %s el %s (duración: %d min, coste: %.2f €)",
                             telefonoCliente, telefonoInterlocutor, inicio, duracion, coste);
    }
    //El String.format lo descrubri haciendo cosas con el chatgpt y me parecio util, por eso he decidido usarlo
    
    @Override
    public int compareTo(Llamada otra) {
        int comparacionTelefono = telefonoCliente.compareTo(otra.telefonoCliente);
        if (comparacionTelefono != 0) {
            return comparacionTelefono;
        } else {
            return inicio.compareTo(otra.inicio);
        }
    }
}
