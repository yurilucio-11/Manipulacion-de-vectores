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

System.out.println("\n==========================================");
System.out.println("MULTIPLOS DE UN NUMERO");
System.out.println("==========================================");

System.out.print("Ingrese el numero X: ");
int x = scanner.nextInt();

boolean hayMultiplos = false;

if (x != 0) {

    for (int i = 0; i < vector.length; i++) {

        if (vector[i] % x == 0) {

            if (!hayMultiplos) {
                System.out.println("Multiplos encontrados:");
            }

            System.out.println(
                "Posicion " + i + ": " + vector[i]
            );

            hayMultiplos = true;
        }
    }

    if (!hayMultiplos) {
        System.out.println(
            "No hay multiplos de " + x + " en el vector."
        );
    }

} else {

    System.out.println(
        "No se pueden calcular multiplos de cero."
    );
}

int suma = 0;

for (int i = 0; i < vector.length; i++) {
    suma += vector[i];
}

System.out.println("\n==========================================");
System.out.println("SUMA TOTAL");
System.out.println("==========================================");

System.out.println(
    "La suma de todos los valores es: " + suma
);

double promedio = (double) suma / vector.length;

int cantidadMayores = 0;

for (int i = 0; i < vector.length; i++) {

    if (vector[i] > promedio) {
        cantidadMayores++;
    }
}

System.out.println("\n==========================================");
System.out.println("VALORES POR ENCIMA DEL PROMEDIO");
System.out.println("==========================================");

System.out.printf("Promedio: %.2f%n", promedio);

if (cantidadMayores > 0) {

    int[] vectorMayores = new int[cantidadMayores];

    int posicion = 0;

    for (int i = 0; i < vector.length; i++) {

        if (vector[i] > promedio) {

            vectorMayores[posicion] = vector[i];

            posicion++;
        }
    }

    System.out.println("Valores por encima del promedio:");

    for (int i = 0; i < vectorMayores.length; i++) {

        System.out.println(
            "Posicion " + i + ": " + vectorMayores[i]
        );
    }

    System.out.println(
        "Cantidad de numeros por encima del promedio: "
        + cantidadMayores
    );

} else {

    System.out.println(
        "No hay numeros mayores que el promedio."
    );
}


scanner.close();
    
    }
}