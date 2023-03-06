package ListaYtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aleag
 */
public class Test {
    public static void main(String[] args) {
        
    
    public void encolar() {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla [tabla.length -1]= a;
        Scanner scaner = new Scanner(System.in);
        int a=scaner.nextInt();
        while(a>=0){
        this.insertarFinal(a);
        a=scaner.nextInt();
        }
        
    }
    public void desencolar() {
        int b=1;
    for (int i = 0; i < tabla.length-2; i++) {
        tabla[i]=tabla[b];
        b++;
    }
    tabla[tabla.length-1]=0;*/
    while(tabla.length>0){
    this.eliminar(0);
        System.out.println(Arrays.toString(tabla));
    }
    }
}

