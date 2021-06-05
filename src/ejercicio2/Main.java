package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> CLIENTES = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean busquedaActiva = true;
        agregarClientes();
        System.out.println("Clientes disponibles: ");
        System.out.println(CLIENTES);
        System.out.println();
        System.out.println("Empezando la búsqueda de clientes.");
        System.out.println("Para finalizar: digite -1");
        System.out.println();

        while (busquedaActiva) {
            System.out.print("Ingresé un cliente a buscar: ");
            final String clienteBuscado = scanner.nextLine();
            if (clienteBuscado.equals("-1")) {
                busquedaActiva = false;
            }
            if (CLIENTES.contains(clienteBuscado)) {
                final int indice = CLIENTES.indexOf(clienteBuscado);
                final int posicion = indice + 1;
                System.out.println("El cliente se encuentra en el índice: " + indice + " en la posición: " + posicion);
                System.out.println();
            } else if (busquedaActiva) {
                System.out.println("Cliente no encontrado. \n");
            } else {
                System.out.println("Fin de la búsqueda.");
            }
        }
    }

    private static void agregarClientes() {
        CLIENTES.add("MERCADO LIBRE");
        CLIENTES.add("ARCOR");
        CLIENTES.add("TOYOTA");
        CLIENTES.add("GOOGLE");
        CLIENTES.add("YPF");
    }
}
