package Mancha;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aleag
 */
public class Mancha {
    public static void main(String[] args) {
        BufferedWriter out = null;
        try {
        out = new BufferedWriter(new FileWriter("Mancha.txt"));
        String cad = "En un lugar de lamancha,\n de cuyo nombre no quiero acordarme";
        out.write(cad);
        out.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
}
}
}
