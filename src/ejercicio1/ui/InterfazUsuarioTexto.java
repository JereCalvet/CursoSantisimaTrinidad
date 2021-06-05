package ejercicio1.ui;

import ejercicio1.logica.Escuela;

import java.util.Scanner;

public class InterfazUsuarioTexto implements InterfazUsuario {

    private final Scanner scanner;
    private final Escuela escuela;

    public InterfazUsuarioTexto() {
        scanner = new Scanner(System.in);
        escuela = new Escuela();
    }

    @Override
    public void run() {
        comenzarInscripcion();
    }

    private void comenzarInscripcion() {
        System.out.println("Empezando la inscripción");
        System.out.println("Para finalizar: digite -1");
        while (escuela.sePuedeSeguirInscribiendo()) {
            System.out.print("Ingrese la cantidad de alumnos a inscribir en un aula: ");
            final Integer cantidadAlumnosAInscribir = Integer.valueOf(scanner.nextLine());
            if (cantidadAlumnosAInscribir == -1) {
                System.out.println("Fin de la inscripción.");
                break;
            }
            escuela.instribirAlumnos(cantidadAlumnosAInscribir);
            imprimirEstadoAulas();
            if (!escuela.sePuedeSeguirInscribiendo()) {
                System.out.println("No quedan mas lugares, fin de la inscripción.");
            }
        }
    }

    private void imprimirEstadoAulas() {
        System.out.println();
        escuela.getAulas().forEach(System.out::println);
        System.out.println();
    }
}
