package Mancha;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author aleag
 */
public class Cadena_Fin {
    public static void main(String[] args) {
         try {
            BufferedWriter out = new BufferedWriter(new FileWriter("texto.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;

            do {
                System.out.print("Enter text: ");
                input = reader.readLine();

                if (!"fin".equals(input)) {
                    out.write(input);
                    out.newLine();
                }
            } while (!"fin".equals(input));

            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

