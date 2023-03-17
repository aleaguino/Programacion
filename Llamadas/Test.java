/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Llamadas;

import java.time.LocalDateTime;

/**
 *
 * @author aleag
 */
public class Test {
    public static void main(String[] args) {

    Llamada llamada = new Llamada("695705892", "678935621", true,
                                  LocalDateTime.of(2023, 5, 9, 11, 35),
                                  LocalDateTime.of(2023, 5, 9, 11, 56),
                                  Llamada.ZonaInterlocutor.ZONA_A);
    
    Llamada llamada2 = new Llamada("954908854", "654810236", true,
                                  LocalDateTime.of(2022, 12, 23, 15, 30),
                                  LocalDateTime.of(2022, 12, 23, 17, 16),
                                  Llamada.ZonaInterlocutor.ZONA_B);
    

    int duracion = llamada.getDuracion();
    double coste = llamada.getCoste();
    
 
    System.out.println(llamada.toString() + " (duración: " + duracion + " min, coste: " + coste + " €)");
    System.out.println(llamada2.toString() + " (duración: " + duracion + " min, coste: " + coste + " €)");

}

}
