package ejercicios;

public class Bicicleta {
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;

    public Bicicleta(String nroDeSerie, String modelo, int año) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "nroDeSerie='" + nroDeSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                '}';
    }
}
