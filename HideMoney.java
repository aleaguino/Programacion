
package pkg2.trimestre;

import java.util.Random;

/**
 *
 * @author aleag
 */
public class HideMoney {
    public static void main(String[] args) {
        int filas = 8;
        int columnas = 4;
        String [][] clase = new String[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                clase[i][j] =" ";
            }
        } 
        Random aleatorio = new Random();
        int fila = aleatorio.nextInt(filas);
        int columna = aleatorio.nextInt(columnas);
        
        clase [fila][columna] = "€";
        
        for (int i = 0; i < filas; i++){
        for (int j = 0; j < columnas; j++){
            System.out.println("(" + i + "," + j + ") " +clase[i][j] +"  ");
        }
            System.out.println();
        }
        
        System.out.println("El billete de 20€ está escondido en la posición: " + fila + "," + columna);

    }
}
