package Ejercicio_Pag23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author aleag
 */
public class Pag23 {

    public static void main(String[] args) throws IOException {
        String fileName = ("txt.txt");
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = reader.readLine();
        reader.close();

        Scanner scanner = new Scanner(line);

        while (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.print(numero + " ");
        }

        scanner.close();
    }
}

