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

for (int i = 0; i < vector.length; i++) {
    System.out.println("Posicion " + i + ": " + vector[i]);
}

System.out.println("\n==========================================");
System.out.println("BUSCAR UN VALOR");
System.out.println("==========================================");

System.out.print("Ingrese el numero que desea buscar: ");
int numeroBuscar = scanner.nextInt();

boolean encontrado = false;

for (int i = 0; i < vector.length; i++) {

    if (vector[i] == numeroBuscar) {

        System.out.println(
            "El numero " + numeroBuscar
            + " se encuentra en la posicion " + i + "."
        );

        encontrado = true;
    }
}

if (!encontrado) {

    System.out.println(
        "El numero " + numeroBuscar
        + " no se encuentra en el vector."
    );
}

int mayor = vector[0];
int menor = vector[0];

for (int i = 1; i < vector.length; i++) {

    if (vector[i] > mayor) {
        mayor = vector[i];
    }

    if (vector[i] < menor) {
        menor = vector[i];
    }
}

System.out.println("\n==========================================");
System.out.println("MAYOR Y MENOR VALOR");
System.out.println("==========================================");

System.out.println("Mayor valor: " + mayor);
System.out.println("Menor valor: " + menor);


scanner.close();
    
    }
}