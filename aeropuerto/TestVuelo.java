
package aeropuerto;

/**
 *
 * @author aleag
 */
public class TestVuelo {
    
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto(Rango.Aguila, 3200, true , "Antonio", "Almeida", "28567086N", "antonio22@gmail.com");
        Azafata azafata1 = new Azafata(Idiomas.Aleman, 1900, "Beatriz", "Prieto", "76986723L", "beatriz33@gmail.com");
        Pasajero pasajero1 = new Pasajero(99871221, "Alejandro", "Aguilar", "29555587N", "aleaguino200@gmail.com");
        Vuelos vuelo1 = new Vuelos ("Sevilla", "Kiev", piloto1, (List<Pasajero>) pasajero1, 5);
    }
}
