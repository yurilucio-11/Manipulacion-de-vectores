import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[15];

        System.out.println("=======================================");
        System.out.println("  MANIPULACION DE VECTORES EN JAVA  ");
        System.out.println("Ingrese 15 numeros entre 10 y 100.\n");

        for(int i = 0; i < vector.length; i++) {

            while (true) {
                
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero >= 10 && numero <= 100) {
                    vector[i] = numero;
                    break;
                }else {
                    System.out.println(
                        "El numero esta fuera del rango "
                        + "Debe estra entre 10 y 100"
                    );
                }
            }
        }

        System.out.println("\n========================");
        System.out.println("VCETOR INGRESADO");
        System.out.println("=========================");

        for (int i = 0 ; i < vector.length; i++) {
            System.out.println("Posicion" + i + ": " + vector[i]);
        }

        scanner.close();
    }
}