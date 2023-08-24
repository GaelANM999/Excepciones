import javax.swing.*;
import java.util.Scanner;

public class ManejoExcepciones{
    public ManejoExcepciones() {

    }
    public void caracterEn(String cadena, int entero) throws Exception{
            if (entero <= cadena.length()){
                System.out.println("El carácter de la posición " + entero + " en la cadena es: " + cadena.charAt(entero));
            }
            else{
                throw new Exception();
            }
    }

}
