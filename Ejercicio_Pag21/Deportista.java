package Ejercicio_Pag21;

import java.util.Scanner;

/**
 *
 * @author aleag
 */
public class Deportista {
    String nombre;
    int edad;
    double estatura;
    
    public Deportista(){}

    public Deportista(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }
    
    
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre, su edad y su altura");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String[] datos = input.split(" ");
        String nombre = datos[0];
        int edad = Integer.parseInt(datos[1]);
        double estatura = Double.parseDouble(datos[2]);

        Deportista deportista = new Deportista(nombre, edad, estatura);
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Estatura: " + deportista.getEstatura());
    }
}


