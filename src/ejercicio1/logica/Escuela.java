package ejercicio1.logica;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private final List<Aula> aulas;

    public Escuela() {
        final Aula azul = new Aula("Azul", 40);
        final Aula verde = new Aula("Verde", 35);
        final Aula amarillo = new Aula("Amarilla", 30);
        aulas = new ArrayList<>();
        aulas.add(azul);
        aulas.add(verde);
        aulas.add(amarillo);
    }

    public void instribirAlumnos(int cantidadAlumnos) {
        for (Aula aula : aulas) {
            if (!aula.estaLLena() && entranEnElAula(cantidadAlumnos, aula)) {
                aula.setCapacidad(aula.getCapacidad() - cantidadAlumnos);
                System.out.println("Los alumnos se inscribieron en el aula " + aula.getColor());
                break;
            }
        }
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public boolean sePuedeSeguirInscribiendo() {
        return !aulas.stream().allMatch(Aula::estaLLena);
    }

    private boolean entranEnElAula(int cantidadAlumnos, Aula aula) {
        return aula.getCapacidad() >= cantidadAlumnos;
    }
}
