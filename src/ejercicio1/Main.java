package ejercicio1;

import ejercicio1.ui.InterfazUsuario;
import ejercicio1.ui.InterfazUsuarioTexto;

public class Main {
    public static void main(String[] args) {
        InterfazUsuario ui = new InterfazUsuarioTexto();
        ui.run();
    }
}
