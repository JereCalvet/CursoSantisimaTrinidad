package ejercicio1.logica;

public class Aula {
    private final String color;
    private int capacidad;

    public Aula(String color, int capacidad) {
        this.color = color;
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean estaLLena() {
        return capacidad == 0;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "En el aula " + color + ", hay " + capacidad + " bancos libres.";
    }
}
