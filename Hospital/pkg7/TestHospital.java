
package Hospital.pkg7;

/**
 *
 * @author aleag
 */
public class TestHospital {
    
    public static void main(String[] args) {
        Trabajador trabajador1 = new Trabajador("Alejandro", "769145764N", 1400);
        Medico medico1 = new Medico("87625K", 15, Especializacion.Pediatra,"Antonio", "29555587N", 4500);
        NoMedicos nomedico1 = new NoMedicos(TipoTrabajador.Limpiadores, "Planta 4", "Juan", "56976439L", 1244);
               
        System.out.println(medico1);
        System.out.println(trabajador1);
        System.out.println(nomedico1);
    }
}
