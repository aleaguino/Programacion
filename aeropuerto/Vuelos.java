
package aeropuerto;

import java.util.List;

/**
 *
 * @author aleag
 */
public class Vuelos {
    private String origen;
    private String destino;
    private Piloto piloto;
    private List<Pasajero> pasajeros;
    private int duracion;
    
    Vuelos(){
    }

    public Vuelos(String origen, String destino, Piloto piloto, List<Pasajero> pasajeros, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.piloto = piloto;
        this.pasajeros = pasajeros;
        this.duracion = duracion;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros del vuelo de " + origen + " a " + destino + ":");
        for (Pasajero pasajero : pasajeros) {
            System.out.println("Nombre: " + pasajero.getNombre() + " " + pasajero.getApellidos());
            System.out.println("DNI: " + pasajero.getDni());
            System.out.println("Pasaporte: " + pasajero.getNumPass());
        }
    } 
    
}
