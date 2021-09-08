package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
    private List<Bicicleta> bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
        bicicletas = new ArrayList<>();
        ganancias = 0;
        cantidadDeVentas = 0;
    }

    public void addBicicleta(Bicicleta nuevaBici) {
        bicicletas.add(nuevaBici);
    }

    public void venderBicicleta(Bicicleta bicicleta) {
        bicicletas.remove(bicicleta);
        cantidadDeVentas++;
        ganancias += bicicleta.getPrecio();
    }

    public Bicicleta buscarBicicleta(String nroDeSerie) {
        return bicicletas
                .stream()
                .filter(b -> b.getNroDeSerie().equals(nroDeSerie))
                .findFirst()
                .orElseGet(() -> null);

        /*for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getNroDeSerie().equals(nroDeSerie)) {
                return bicicleta;
            }
        }
        return null;*/
    }
}
