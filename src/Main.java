import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese una cadena de texto: ");
        Scanner sc= new Scanner(System.in);
        String lectTeclado= sc.nextLine();
        ManejoExcepciones me= new ManejoExcepciones();

        try {
            me.caracterEn(lectTeclado,7);
        } catch (Exception e){
            System.out.println("Has intentado recuperar una posición de la cadena de caracteres que no existe");
        }
    }
}
