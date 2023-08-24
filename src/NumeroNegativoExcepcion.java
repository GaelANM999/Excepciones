import java.util.Scanner;

public class NumeroNegativoExcepcion extends Exception {
    public static void main(String[] args) throws NumeroNegativoExcepcion {
        NumeroNegativoExcepcion nn= new NumeroNegativoExcepcion();
        System.out.println("Ingrese un número para obetener su raíz: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        nn.valorNum(num);
    }

    public NumeroNegativoExcepcion() {
    }

    public NumeroNegativoExcepcion(String message) {
        super(message);
    }

    public void valorNum(int num) throws NumeroNegativoExcepcion {
        if (num>=0){
            float raiz= (float) Math.sqrt(num);
            System.out.println(raiz);
        }
        else {
            throw new NumeroNegativoExcepcion();
        }
    }
}
